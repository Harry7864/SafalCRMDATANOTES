package com.example.safalcrm.utillity;


import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.example.safalcrm.R;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class DateSelectDialogFragment extends DialogFragment {

    @BindView(R.id.calendarView)
    MaterialCalendarView widget;
    @BindView(R.id.spinnerMonths)
    Spinner spinnerMonths;
    @BindView(R.id.spinnerYears)
    Spinner spinnerYears;
    String[] monthString = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String todayDate = "";
    private PreferenceManager preferenceManager;
    private String setCustomDate = "";
    private String tempCustomDate = "";
    private int setDay, setMonth, setYear;
    private boolean setMinCurrentDate = false;
    private boolean isBirthDate = false;
    private boolean setMaxDateToday = false;
    private List<String> yearList = new ArrayList<>();
    private List<String> monthList = new ArrayList<>();
    private int currentYear, lastYear;
    private String currentMonth;
    private String strSelectedDate;
    private OnDateSelectListener onDateSelectListener;
    private String[] separated;

    public DateSelectDialogFragment(String setCustomDate, boolean isBirthDate, boolean setMinCurrentDate, OnDateSelectListener onDateSelectListener) {
        this.setCustomDate = setCustomDate;
        this.onDateSelectListener = onDateSelectListener;
        this.setMinCurrentDate = setMinCurrentDate;
        this.isBirthDate = isBirthDate;
    }

    public DateSelectDialogFragment(String setCustomDate, boolean isBirthDate, boolean setMinCurrentDate, boolean setMaxDateToday, OnDateSelectListener onDateSelectListener) {
        this.setCustomDate = setCustomDate;
        this.onDateSelectListener = onDateSelectListener;
        this.setMinCurrentDate = setMinCurrentDate;
        this.setMaxDateToday = setMaxDateToday;
        this.isBirthDate = isBirthDate;
    }

    public boolean checkDatesAfter(String selectedDate, String today) {
        boolean b = false;
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dfDate = new SimpleDateFormat("yyyyMMdd");
        try {
            if (Objects.requireNonNull(dfDate.parse(selectedDate)).after(dfDate.parse(today))) {
                b = true; // If start date is after the end date
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        int height = display.getHeight();
        int width = display.getWidth();
        if (dialog != null) {
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, /*(int) (height / 1.5)*/ViewGroup.LayoutParams.MATCH_PARENT);
            //getDialog().getWindow().setGravity(Gravity.CENTER);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_date_select_dialog, container, false);
        ButterKnife.bind(this, v);
        preferenceManager = new PreferenceManager(getActivity());

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        String newDate = sdf.format(c.getTime());
        todayDate = sdf1.format(c.getTime());

        Calendar c2 = Calendar.getInstance();
        c2.setTime(new Date());
        c2.add(Calendar.MONTH, 1);
        String endDate = sdf.format(c2.getTime());

        StringTokenizer st1 = new StringTokenizer(newDate, "-");
        StringTokenizer st2 = new StringTokenizer(endDate, "-");

        int dayS = Integer.parseInt(st1.nextToken());
        int monthS = Integer.parseInt(st1.nextToken());
        int yearS = Integer.parseInt(st1.nextToken());

        int dayE = Integer.parseInt(st2.nextToken());
        int monthE = Integer.parseInt(st2.nextToken());
        int yearE = Integer.parseInt(st2.nextToken());

        if (setMinCurrentDate) {
            //int currentMonth = monthS - 1;
            int currentMonth = monthS - 1;
            monthList = GetLeftMonth(currentMonth);
        } else {
            if (setMaxDateToday) {
                int currentMonth = monthS - 1;
                monthList = GetPastMonths(currentMonth);
            } else {
                monthList = GetLeftMonth(0);
            }
        }

        if (setCustomDate != null && setCustomDate.length() > 0) {
            strSelectedDate = setCustomDate;
        } else {
            strSelectedDate = yearS + "-" + pad(monthS) + "-" + pad(dayS);
        }
        currentMonth = (String) DateFormat.format("MMMM", new Date());

        currentYear = c.get(Calendar.YEAR);
        int currentDate = c.get(Calendar.DATE);
        lastYear = currentYear - 50;
        yearList.add(currentYear + "");

        if (!setMinCurrentDate) {
            for (int i = 0; i < 100; i++) {
                currentYear = currentYear - 1;
                yearList.add(currentYear + "");
            }
        } else {
            for (int i = 0; i < 2; i++) {
                currentYear = currentYear + 1;
                yearList.add(currentYear + "");
            }
        }

        currentYear = c.get(Calendar.YEAR);

        ArrayAdapter months = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, monthList);
        months.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMonths.setAdapter(months);

        ArrayAdapter years = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, yearList);
        years.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerYears.setAdapter(years);
        tempCustomDate = setCustomDate;
        if (!setCustomDate.equalsIgnoreCase("")) {

            separated = setCustomDate.split("/");

            setDay = stringToInt(separated[0]);
            setMonth = stringToInt(separated[1]);
            setYear = stringToInt(separated[2]);

            widget.setSelectedDate(CalendarDay.from(setYear, setMonth, setDay));

            for (int i = 0; i < yearList.size(); i++) {
                if (yearList.get(i).toLowerCase().equalsIgnoreCase(setYear + "")) {
                    spinnerYears.setSelection(i);
                }
            }

            for (int i = 0; i < monthList.size(); i++) {
                if (monthList.get(i).toLowerCase().equalsIgnoreCase(getMonthName(setMonth))) {
                    spinnerMonths.setSelection(i);
                }
            }

            setCustomDate = "";

        } else {
            for (int i = 0; i < monthList.size(); i++) {
                if (monthList.get(i).toLowerCase().equalsIgnoreCase(currentMonth)) {
                    spinnerMonths.setSelection(i);
                }
            }

            widget.setSelectedDate(CalendarDay.from(yearS, monthS, currentDate));
        }

        spinnerMonths.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (setCustomDate.equalsIgnoreCase("")) {
                    if (setMinCurrentDate) {
                        String year = spinnerYears.getSelectedItem().toString();
                        int selectedYear = Integer.parseInt(year);
                        widget.setCurrentDate(CalendarDay.from(selectedYear, getMonthNumber(spinnerMonths.getSelectedItem().toString()), 1));
                    } else {
                        String year = spinnerYears.getSelectedItem().toString();
                        int selectedYear = Integer.parseInt(year);
                        widget.setCurrentDate(CalendarDay.from(selectedYear, position + 1, 1));
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerYears.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (setCustomDate.equalsIgnoreCase("")) {
                    int selectedYear = Integer.parseInt(yearList.get(position));
                    if (setMinCurrentDate) {
                        monthList.clear();

                        if (currentYear != selectedYear) {
                            monthList = GetLeftMonth(0);
                        } else {
                            //int currentMonth = monthS - 1;
                            int currentMonth = monthS - 1;
                            monthList = GetLeftMonth(currentMonth);
                        }

                        ArrayAdapter months = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, monthList);
                        months.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinnerMonths.setAdapter(months);

                        widget.setCurrentDate(CalendarDay.from(selectedYear, spinnerMonths.getSelectedItemPosition() + 1, 1));
                    } else {

                        if (setMaxDateToday) {
                            if (currentYear != selectedYear) {
                                monthList = GetLeftMonth(0);
                            } else {
                                //int currentMonth = monthS - 1;
                                int currentMonth = monthS - 1;
                                monthList = GetPastMonths(currentMonth);
                            }

                            ArrayAdapter months = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, monthList);
                            months.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            spinnerMonths.setAdapter(months);

                            for (int i = 0; i < monthList.size(); i++) {
                                if (monthList.get(i).toLowerCase().equalsIgnoreCase(currentMonth)) {
                                    spinnerMonths.setSelection(i);
                                }
                            }

                        }
                        widget.setCurrentDate(CalendarDay.from(selectedYear, spinnerMonths.getSelectedItemPosition() + 1, 1));

                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        widget.setTopbarVisible(false);

//        widget.setSelected(true);
        widget.setSelectionColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));

        if (setMinCurrentDate) {
            widget.state().edit()
                    .setCalendarDisplayMode(CalendarMode.MONTHS)
                    .setMinimumDate(CalendarDay.from(yearS, monthS, dayS))
                    //.setMaximumDate(CalendarDay.from(yearE, monthE, dayE))
                    .setShowWeekDays(true)
                    .commit();
        } else {
            if (setMaxDateToday) {
                if (!tempCustomDate.trim().isEmpty()) {

                    widget.state().edit()
                            .setCalendarDisplayMode(CalendarMode.MONTHS)
                            .setMaximumDate(CalendarDay.from(yearS, monthS, currentDate))
                            .setMinimumDate(CalendarDay.from(setYear, setMonth, setDay))
                            .setShowWeekDays(true)
                            .commit();

                } else {
                    widget.state().edit()
                            .setCalendarDisplayMode(CalendarMode.MONTHS)
                            .setMaximumDate(CalendarDay.from(yearS, monthS, currentDate))
                            .setShowWeekDays(true)
                            .commit();
                }
            } else {
                widget.state().edit()
                        .setCalendarDisplayMode(CalendarMode.MONTHS)
                        //.setMaximumDate(CalendarDay.from(yearS, monthS, currentDate))
                        .setShowWeekDays(true)
                        .commit();
            }
        }


        widget.setPagingEnabled(false);

        widget.setSelectionMode(MaterialCalendarView.SELECTION_MODE_SINGLE);
        widget.setShowOtherDates(MaterialCalendarView.SHOW_OUT_OF_RANGE);
        widget.setOnDateChangedListener((materialCalendarView, calendarDay, b) -> {
            if (b) {
                strSelectedDate = calendarDay.getDate() + "";
            }
        });
    }

    private int stringToInt(String str) {
        int iv = 0;

        try {
            iv = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return iv;
    }

    public String pad(int input) {
        if (input >= 10) {
            return String.valueOf(input);
        } else {
            return "0" + input;
        }
    }

    public List<String> GetLeftMonth(Integer Mon_num) {
        List<String> monthsList = new ArrayList<String>();
        String[] months = new DateFormatSymbols().getMonths();
        for (int i = Mon_num; i < months.length; i++) {
            String month = months[i];
            monthsList.add(months[i]);
        }
        return monthsList;
    }

    public List<String> GetPastMonths(Integer Mon_num) {
        List<String> monthsList = new ArrayList<String>();
        String[] months = new DateFormatSymbols().getMonths();
        for (int i = 0; i <= Mon_num; i++) {
            String month = months[i];
            monthsList.add(months[i]);
        }
        return monthsList;
    }


    @OnClick(R.id.btnCancel)
    public void btnCancel() {
        dismiss();
    }

    @OnClick(R.id.btnSelect)
    void btnSelect() {

        if (strSelectedDate.isEmpty()) {
            Toast.makeText(getContext(), "Please select date", Toast.LENGTH_SHORT).show();
        } else if (isBirthDate) {
            String sDate = strSelectedDate.replace("-", "");
            if (Integer.parseInt(sDate) > Integer.parseInt(todayDate)) {
                Tools.toast(getContext(), "Future date not allowed", 1);
            } else {
                if (onDateSelectListener != null) {
                    onDateSelectListener.onDateSelect(strSelectedDate);
                    dismiss();
                }
            }
        } else {
            if (onDateSelectListener != null) {
                onDateSelectListener.onDateSelect(strSelectedDate);
                dismiss();
            }
        }
    }

    public String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }

        return null;
    }

    public int getMonthNumber(String strMonth) {
        switch (strMonth) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
        }

        return 0;
    }

    public interface OnDateSelectListener {
        void onDateSelect(String strDate);
    }

}
