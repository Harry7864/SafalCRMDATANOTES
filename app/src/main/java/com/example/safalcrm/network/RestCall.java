package com.example.safalcrm.network;

import com.example.safalcrm.networkResponse.AddressResponse;
import com.example.safalcrm.networkResponse.AllMembersResponse;
import com.example.safalcrm.networkResponse.AppMenuResponse;
import com.example.safalcrm.networkResponse.AreaResponse;
import com.example.safalcrm.networkResponse.BannerResponse;
import com.example.safalcrm.networkResponse.BillingDetailsResponse;
import com.example.safalcrm.networkResponse.BlockedMemberResponse;
import com.example.safalcrm.networkResponse.BusinessHousesResponse;
import com.example.safalcrm.networkResponse.CardResponse;
import com.example.safalcrm.networkResponse.CategoryResponse;
import com.example.safalcrm.networkResponse.ChatResponse;
import com.example.safalcrm.networkResponse.CheckLoginResponse;
import com.example.safalcrm.networkResponse.CircularsResponse;
import com.example.safalcrm.networkResponse.CityResponse;
import com.example.safalcrm.networkResponse.ClassifiedCategoryResponse;
import com.example.safalcrm.networkResponse.ClassifiedResponse;
import com.example.safalcrm.networkResponse.CllassifiedSubCategoriesResponse;
import com.example.safalcrm.networkResponse.CommentResponce;
import com.example.safalcrm.networkResponse.CommonResponse;
import com.example.safalcrm.networkResponse.CountryResponse;
import com.example.safalcrm.networkResponse.EmojiResponse;
import com.example.safalcrm.networkResponse.FollowingDetailsResponse;
import com.example.safalcrm.networkResponse.FrameAndImagesResponse;
import com.example.safalcrm.networkResponse.FrameImagesResponse;
import com.example.safalcrm.networkResponse.FramesResponse;
import com.example.safalcrm.networkResponse.GeoTagResponse;
import com.example.safalcrm.networkResponse.LoginResponse;
import com.example.safalcrm.networkResponse.MemberListResponce;
import com.example.safalcrm.networkResponse.MemberPlanListResponse;
import com.example.safalcrm.networkResponse.MemeberProfileResponse;
import com.example.safalcrm.networkResponse.NewsFeedResponce;
import com.example.safalcrm.networkResponse.NotificationResponse;
import com.example.safalcrm.networkResponse.ProfessionalDetailsResponse;
import com.example.safalcrm.networkResponse.ProfileResponse;
import com.example.safalcrm.networkResponse.PromitionEventListResponse;
import com.example.safalcrm.networkResponse.RecentMemberListResponce;
import com.example.safalcrm.networkResponse.RegisterCategoryResponse;
import com.example.safalcrm.networkResponse.StateResponse;
import com.example.safalcrm.networkResponse.SubCategoryResponse;
import com.example.safalcrm.networkResponse.TempUserRegisterResponse;
import com.example.safalcrm.networkResponse.ViewMemberListResponse;
import com.example.safalcrm.networkResponse.ZooBizContactUsResponse;
import com.example.safalcrm.networkResponse.centerImageDetailsResponse;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import rx.Single;

public interface RestCall {

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<BlockedMemberResponse> getMyBlockedMember(
            @Field("getMyBlockedMember") String getMyBlockedMember,
            @Field("user_id") String user_id
    );

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<CommonResponse> changeMobilePrivacy(
            @Field("changeMobilePrivacy") String changeMobilePrivacy,
            @Field("user_id") String user_id,
            @Field("public_mobile") String public_mobile
    );

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<CommonResponse> changeWahtasappPrivacy(
            @Field("changeWahtasappPrivacy") String changeWahtasappPrivacy,
            @Field("user_id") String user_id,
            @Field("whatsapp_privacy") String whatsapp_privacy
    );

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<CommonResponse> changeEmailIdPrivacy(
            @Field("changeEmailIdPrivacy") String changeEmailIdPrivacy,
            @Field("user_id") String user_id,
            @Field("email_privacy") String email_privacy
    );

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<CommonResponse> cllassifiedMuteStatus(
            @Field("cllassifiedMuteStatus") String cllassifiedMuteStatus,
            @Field("user_id") String user_id,
            @Field("cllassified_mute") String cllassified_mute
    );

    @FormUrlEncoded
    @POST("emoji_response.json")
    Single<EmojiResponse> getEmoji(
            @Field("getEmoji") String tag);

    @FormUrlEncoded
    @POST("chat_controller.php")
    Single<CommonResponse> addChat(@Field("addChat") String addFeed,
                                   @Field("chat_id_reply") String chat_id_reply,
                                   @Field("msg_by") String msg_by,
                                   @Field("msg_for") String msg_for,
                                   @Field("msg_data") String msg_data,
                                   @Field("msgType") String msgType,
                                   @Field("location_lat_long") String location_lat_long,
                                   @Field("user_name") String user_name,
                                   @Field("user_profile") String user_profile,
                                   @Field("user_mobile") String user_mobile,
                                   @Field("public_mobile") String public_mobile);

    @Multipart
    @POST("chat_controller.php")
    Single<CommonResponse> addChatMultiMedia(@Part("addChatWithDoc") RequestBody addChat,
                                             @Part("chat_id_reply") RequestBody chat_id_reply,
                                             @Part("msg_by") RequestBody msg_by,
                                             @Part("msg_for") RequestBody msg_for,
                                             @Part("msg_data[]") List<RequestBody> msg_data,
                                             @Part("msgType") RequestBody msgType,
                                             @Part("location_lat_long") RequestBody location_lat_long,
                                             @Part("user_name") RequestBody user_name,
                                             @Part("user_profile") RequestBody user_profile,
                                             @Part("user_mobile") RequestBody user_mobile,
                                             @Part("public_mobile") RequestBody public_mobile,
                                             @Part("file_duration") RequestBody file_duration,
                                             @Part List<MultipartBody.Part> chat_doc);

    @FormUrlEncoded
    @POST("chat_controller.php")
    Single<CommonResponse> chatBlock(@Field("chatBlock") String chatBlock,
                                     @Field("block_by") String block_by,
                                     @Field("block_for") String block_for);

    @FormUrlEncoded
    @POST("chat_controller.php")
    Single<CommonResponse> chatUnBlock(@Field("chatUnBlock") String chatUnBlock,
                                       @Field("block_by") String block_by,
                                       @Field("block_for") String block_for);

    @FormUrlEncoded
    @POST("chat_controller.php")
    Single<CommonResponse> deleteChatMulti(@Field("deleteChatMulti") String deleteChatMulti,
                                           @Field("user_id") String user_id,
                                           @Field("chat_id") String chat_id);



    @FormUrlEncoded
    @POST("chat_controller.php")
    Single<ChatResponse> getPrvChatNew(@Field("getPrvChatNew") String getPrvChatNew,
                                       @Field("user_id") String user_id,
                                       @Field("isRead") String isRead,
                                       @Field("userId") String userId);

    @FormUrlEncoded
    @POST("chat_controller.php")
    Single<RecentMemberListResponce> getRecentChatMember(@Field("getRecentChatMember") String getRecentChatMember,
                                                         @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("chat_controller.php")
    Single<MemberListResponce> getMemberList(@Field("getMemberList") String getMemberList,
                                             @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("notification_controller.php")
    Single<NotificationResponse> getNotification(@Field("getNotification") String getNotification,
                                                 @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("notification_controller.php")
    Single<NotificationResponse> getNotificationTimeline(@Field("getNotificationTimeline") String getNotificationTimeline,
                                                         @Field("user_id") String user_id,
                                                         @Field("read") String val);

    @FormUrlEncoded
    @POST("notification_controller.php")
    Single<CommonResponse> DeleteUserNotification(@Field("DeleteUserNotification") String DeleteUserNotification,
                                                  @Field("user_notification_id") String user_notification_id);

    @FormUrlEncoded
    @POST("notification_controller.php")
    Single<CommonResponse> DeleteUserNotificationAll(@Field("DeleteUserNotificationAll") String DeleteUserNotificationAll,
                                                     @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("notification_controller.php")
    Single<CommonResponse> DeleteUserNotificationAllTimeline(@Field("DeleteUserNotificationAllTimeline") String DeleteUserNotificationAllTimeline,
                                                             @Field("user_id") String user_id);

    @Multipart
    @POST("timeline_controller.php")
    Single<CommonResponse> addTimelinePost(@Part("addFeed") RequestBody addFeed,
                                           @Part("user_id") RequestBody user_id,
                                           @Part("timeline_id") RequestBody timeline_id,
                                           @Part("feed_type") RequestBody feed_type,
                                           @Part("timeline_text") RequestBody timeline_text,
                                           @Part("user_name") RequestBody user_name,
                                           @Part List<MultipartBody.Part> photos);


    @FormUrlEncoded
    @POST("timeline_controller.php")
    Single<CommentResponce> getComments(@Field("getComments") String getComments,
                                        @Field("timeline_id") String timeline_id);

    @FormUrlEncoded
    @POST("timeline_controller.php")
    Single<NewsFeedResponce> getNewsFeed(@Field("getFeed") String getFeed,
                                         @Field("user_id") String user_id,
                                         @Field("limit_feed") int limit,
                                         @Field("pos1") int pos);

    @FormUrlEncoded
    @POST("timeline_controller.php")
    Single<NewsFeedResponce> getFeedTimeline(@Field("getNotificationFeed") String getNotificationFeed,
                                             @Field("user_id") String user_id,
                                             @Field("timeline_id") String timelineId);

    @FormUrlEncoded
    @POST("timeline_controller.php")
    Single<NewsFeedResponce> getMyFeed(@Field("getMyFeed") String getMyFeed,
                                       @Field("user_id") String user_id,
                                       @Field("my_id") String my_id);

    @FormUrlEncoded
    @POST("timeline_controller.php")
    Single<CommonResponse> addFeedLike(@Field("likeFeed") String likeFeed,
                                       @Field("timeline_id") String feed_id,
                                       @Field("user_id") String user_id,
                                       @Field("user_name") String user_name,
                                       @Field("like_status") String like_status);

    @FormUrlEncoded
    @POST("timeline_controller.php")
    Single<CommonResponse> deleteCommentFeed(@Field("deleteComment") String deleteComment,
                                             @Field("comments_id") String comments_id,
                                             @Field("user_id") String user_id);


    @FormUrlEncoded
    @POST("timeline_controller.php")
    Single<CommonResponse> deleteFeed(@Field("deleteFeed") String deleteFeed,
                                      @Field("timeline_id") String timeline_id,
                                      @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("timeline_controller.php")
    Single<CommentResponce> commentFeed(@Field("commentFeed") String commentFeed,
                                        @Field("timeline_id") String feed_id,
                                        @Field("parent_comments_id") String parent_comments_id,
                                        @Field("user_id") String user_id,
                                        @Field("user_name") String user_name,
                                        @Field("msg") String msg);

    @Multipart
    @POST("profesional_detail_controller.php")
    Single<CommonResponse> addProfessionalDetails(
            @Part("add_professional_info") RequestBody add_professional_info,
            @Part("employment_id") RequestBody employment_id,
            @Part("user_id") RequestBody user_id,
            @Part("user_full_name") RequestBody user_full_name,
            @Part("user_phone") RequestBody user_phone,
            @Part("user_email") RequestBody user_email,
            @Part("business_category_id") RequestBody business_category_id,
            @Part("business_sub_category_id") RequestBody business_sub_category_id,
            @Part("business_description") RequestBody business_description,
            @Part("company_name") RequestBody company_name,
            @Part("designation") RequestBody designation,
            @Part("company_website") RequestBody company_website,
            @Part("search_keyword") RequestBody search_keyword,
            @Part("products_servicess") RequestBody products_servicess,
            @Part("company_email") RequestBody company_email,
            @Part("company_contact_number") RequestBody company_contact_number,
            @Part("is_company_logo") RequestBody is_company_logo,
            @Part MultipartBody.Part company_logo,
            @Part("company_logo_old") RequestBody company_logo_old,
            @Part("is_company_profile") RequestBody is_company_profile,
            @Part MultipartBody.Part company_profile,
            @Part("company_profile_old") RequestBody company_profile_old,
            @Part("is_company_broucher") RequestBody is_company_broucher,
            @Part MultipartBody.Part company_broucher,
            @Part("company_broucher_old") RequestBody company_broucher_old
    );

    @Multipart
    @POST("user_controller.php")
    Single<ProfileResponse> changeProfile(
            @Part("setProfilePicture") RequestBody setProfilePicture,
            @Part("user_id") RequestBody user_id,
            @Part MultipartBody.Part user_profile_pic);

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<LoginResponse> getFollowingDeatils(
            @Field("getFollowingDeatils") String getFollowingDeatils,
            @Field("user_id") String user_id);


    @FormUrlEncoded
    @POST("user_controller.php")
    Single<CommonResponse> changeMobileNumber(
            @Field("changeMobileNumber") String changeMobileNumber,
            @Field("user_mobile") String user_mobile,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<CommonResponse> changeMobileNumberVerify(
            @Field("changeMobileNumberVerify") String changeMobileNumberVerify,
            @Field("user_mobile") String user_mobile,
            @Field("otp") String otp,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("get_billing_details_controller.php")
    Single<BillingDetailsResponse> getBillingInfo(
            @Field("get_billing_info") String get_billing_info,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("get_billing_details_controller.php")
    Single<CommonResponse> addBillingInfo(
            @Field("add_billing_info") String add_billing_info,
            @Field("employment_id") String employment_id,
            @Field("user_id") String user_id,
            @Field("company_name") String company_name,
            @Field("billing_address") String company_address,
            @Field("company_website") String company_website,
            @Field("company_contact_number") String company_contact_number,
            @Field("gst_number") String gst_number,
            @Field("billing_pincode") String billing_pincode,
            @Field("bank_name") String bank_name,
            @Field("bank_account_number") String bank_account_number,
            @Field("ifsc_code") String ifsc_code,
            @Field("billing_contact_person") String billing_contact_person,
            @Field("billing_contact_person_name") String billing_contact_person_name
    );

    @FormUrlEncoded
    @POST("member_controller.php")
    Single<MemberPlanListResponse> getPackage(
            @Field("getPackage") String getPackage);

    @FormUrlEncoded
    @POST("member_controller.php")
    Single<CategoryResponse> getCategory(
            @Field("getCategory") String getCategory,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("member_controller.php")
    Single<RegisterCategoryResponse> getSubCategoryRegister(
            @Field("getSubCategoryRegister") String getSubCategoryRegister);


    @FormUrlEncoded
    @POST("member_controller.php")
    Single<SubCategoryResponse> getSubCategory(
            @Field("getSubCategory") String getSubCategory,
            @Field("business_category_id") String business_category_id);

    @FormUrlEncoded
    @POST("member_controller.php")
    Single<CommonResponse> followCategory(
            @Field("followCategory") String followCategory,
            @Field("category_id") String category_id,
            @Field("category_name") String category_name,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("member_controller.php")
    Single<CommonResponse> unFollowCategory(
            @Field("unFollowCategory") String unFollowCategory,
            @Field("category_follow_id") String category_follow_id,
            @Field("category_name") String category_name);

    @FormUrlEncoded
    @POST("otp_controller.php")
    Single<CommonResponse> userLogout(
            @Field("user_logout") String user_logout,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("otp_controller.php")
    Single<CommonResponse> Login(
            @Field("user_login") String user_login,
            @Field("country_code") String country_code,
            @Field("user_mobile") String user_mobile);


    @FormUrlEncoded
    @POST("otp_controller.php")
    Single<LoginResponse> OTPVerify(
            @Field("user_verify") String user_verify,
            @Field("user_mobile") String user_mobile,
            @Field("otp") String otp,
            @Field("user_token") String user_token,
            @Field("device") String device,
            @Field("phone_model") String phone_model,
            @Field("phone_brand") String phone_brand);

    @FormUrlEncoded
    @POST("app_menu_controller.php")
    Single<AppMenuResponse> GetMenuList(@Field("getAppMenu") String getAppMenu);

    @FormUrlEncoded
    @POST("get_slider_controller.php")
    Single<BannerResponse> GetBannerList(@Field("getSlider") String getSlider);

    @FormUrlEncoded
    @POST("company_address_controller.php")
    Single<CountryResponse> getCountries(@Field("get_countries") String get_countries,
                                         @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("company_address_controller.php")
    Single<StateResponse> getStates(@Field("get_states") String get_states,
                                    @Field("user_id") String user_id,
                                    @Field("country_id") String country_id
    );

    @FormUrlEncoded
    @POST("company_address_controller.php")
    Single<CommonResponse> deleteAddress(@Field("delete_address") String delete_address,
                                         @Field("user_id") String user_id,
                                         @Field("adress_id") String adress_id
    );

    @FormUrlEncoded
    @POST("company_address_controller.php")
    Single<CityResponse> getCity(@Field("get_cities") String get_cities,
                                 @Field("user_id") String user_id,
                                 @Field("country_id") String country_id,
                                 @Field("state_id") String state_id);

    @FormUrlEncoded
    @POST("register_controller.php")
    Single<CityResponse> getCityForRegister(@Field("get_cities") String get_cities,
                                            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("company_address_controller.php")
    Single<AreaResponse> getArea(@Field("get_area") String get_area,
                                 @Field("user_id") String user_id,
                                 @Field("country_id") String country_id,
                                 @Field("state_id") String state_id,
                                 @Field("city_id") String city_id
    );

    @FormUrlEncoded
    @POST("company_address_controller.php")
    Single<AddressResponse> getCompanyAddress(@Field("get_company_address") String get_company_address,
                                              @Field("user_id") String user_id
    );

    @FormUrlEncoded
    @POST("company_address_controller.php")
    Single<CommonResponse> addCompanyAddress(@Field("add_company_address") String add_company_address,
                                             @Field("adress_id") String adress_id,
                                             @Field("user_id") String user_id,
                                             @Field("adress") String adress,
                                             @Field("city_id") String city_id,
                                             @Field("state_id") String state_id,
                                             @Field("country_id") String country_id,
                                             @Field("area_id") String area_id,
                                             @Field("pincode") String pincode,
                                             @Field("latitude") String latitude,
                                             @Field("longitude") String longitude,
                                             @Field("adress_type") String adress_type
    );


    @FormUrlEncoded
    @POST("profesional_detail_controller.php")
    Single<ProfessionalDetailsResponse> getProfessionalInfo(@Field("get_professional_info") String get_professional_info,
                                                            @Field("user_id") String user_id
    );

    @FormUrlEncoded
    @POST("otp_controller.php")
    Single<CommonResponse> editBasicInfo(@Field("edit_basic_info") String edit_basic_info,
                                         @Field("user_id") String user_id,
                                         @Field("user_first_name") String user_first_name,
                                         @Field("user_last_name") String user_last_name,
                                         @Field("user_full_name") String user_full_name,
                                         @Field("gender") String gender,
                                         @Field("member_date_of_birth") String member_age,
                                         @Field("user_email") String user_email,
                                         @Field("user_mobile") String user_mobile,
                                         @Field("alt_mobile") String alt_mobile,
                                         @Field("whatsapp_number") String whatsapp_number,
                                         @Field("facebook") String facebook,
                                         @Field("instagram") String instagram,
                                         @Field("linkedin") String linkedin,
                                         @Field("twitter") String twitter,
                                         @Field("salutation") String salutation
    );


    //-- circularsController
    @FormUrlEncoded
    @POST("circularsController.php")
    Single<CircularsResponse> GetCircularsList(
            @Field("getCirculars") String getCirculars,
            @Field("user_id") String user_id);

    //--Classified

    @Multipart
    @POST("cllassifiedController.php")
    Single<CommonResponse> addCllassified(
            @Part("addCllassified") RequestBody addCllassified,
            @Part("business_category_id") RequestBody business_category_id,
            @Part("business_sub_category_id") RequestBody business_sub_category_id,
            @Part("state_id") RequestBody state_id,
            @Part("city_id") RequestBody city_id,
            @Part("user_id") RequestBody user_id,
            @Part("user_name") RequestBody user_name,
            @Part("cllassified_title") RequestBody cllassified_title,
            @Part("cllassified_description") RequestBody cllassified_description,
            @Part MultipartBody.Part cllassified_photo,
            @Part MultipartBody.Part cllassified_file);

    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<ClassifiedResponse> GetClassfiedList(
            @Field("getCllassified") String getCllassified,
            @Field("user_id") String user_id,
            @Field("business_category_id") String business_category_id,
            @Field("business_sub_category_id") String business_sub_category_id,
            @Field("state_id") String state_id,
            @Field("city_id") String city_id);

    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<ClassifiedResponse> GetClassfiedDetails(
            @Field("getCllassifiedDetails") String getCllassifiedDetails,
            @Field("user_id") String user_id,
            @Field("cllassified_id") String cllassified_id);


    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<CommonResponse> AddCllassifiedComment(
            @Field("addCllassifiedComment") String addCllassifiedComment,
            @Field("user_id") String user_id,
            @Field("user_name") String user_name,
            @Field("cllassified_id") String cllassified_id,
            @Field("comment_messaage") String comment_messaage);

    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<CommonResponse> AddReplyComment(
            @Field("addReplyComment") String addReplyComment,
            @Field("user_id") String user_id,
            @Field("user_name") String user_name,
            @Field("cllassified_id") String cllassified_id,
            @Field("comment_messaage") String comment_messaage,
            @Field("comment_id") String comment_id);

    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<CommonResponse> MuteUnmuteComment(
            @Field("addMute") String addMute,
            @Field("user_id") String user_id,
            @Field("cllassified_id") String cllassified_id,
            @Field("mute_type") String mute_type);

    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<CommonResponse> MuteAllDiscussion(
            @Field("muteAllDiscussion") String muteAllDiscussion,
            @Field("user_id") String user_id,
            @Field("cllassified_mute") String cllassified_mute);

    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<CommonResponse> DeleteClassified(
            @Field("deleteCllassified") String deleteCllassified,
            @Field("user_id") String user_id,
            @Field("cllassified_id") String cllassified_id);


    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<CommonResponse> deleteComment(
            @Field("deleteComment") String deleteComment,
            @Field("user_id") String user_id,
            @Field("comment_id") String comment_id);

    @FormUrlEncoded
    @POST("business_houses_controller.php")
    Single<BusinessHousesResponse> GetBusinessHouse(
            @Field("getBusinessHouses") String getBusinessHouses,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("follow_controller.php")
    Single<CommonResponse> FollowMember(
            @Field("addFollow") String addFollow,
            @Field("user_id") String user_id,
            @Field("follow_to") String follow_to,
            @Field("user_name") String user_name);

    @FormUrlEncoded
    @POST("follow_controller.php")
    Single<CommonResponse> UnFollowMember(
            @Field("unFollow") String unFollow,
            @Field("user_id") String user_id,
            @Field("follow_to") String follow_to,
            @Field("user_name") String user_name);

    @FormUrlEncoded
    @POST("zoobiz_contact_controller.php")
    Single<ZooBizContactUsResponse> GetzoobizContact(
            @Field("zoobiz_contacts") String zoobiz_contacts,
            @Field("user_id") String user_id);


    @Multipart
    @POST("zoobiz_contact_controller.php")
    Single<CommonResponse> send_feedback(@Part("send_feedback") RequestBody send_feedback,
                                         @Part("name") RequestBody name,
                                         @Part("email") RequestBody email,
                                         @Part("mobile") RequestBody mobile,
                                         @Part("subject") RequestBody subject,
                                         @Part("feedback_msg") RequestBody feed_msg,
                                         @Part MultipartBody.Part attachment
    );

    @FormUrlEncoded
    @POST("member_controller.php")
    Single<ViewMemberListResponse> GetViewMemberList(
            @Field("getMembers") String getMembers,
            @Field("user_id") String user_id,
            @Field("business_category_id") String business_category_id,
            @Field("business_sub_category_id") String business_sub_category_id,
            @Field("city_id") String city_id,
            @Field("state_id") String state_id);

    @FormUrlEncoded
    @POST("member_controller.php")
    Single<AllMembersResponse> getMembersAll(
            @Field("getMembersAll") String getMembersAll,
            @Field("user_id") String user_id,
            @Field("business_category_id") String business_category_id,
            @Field("business_sub_category_id") String business_sub_category_id,
            @Field("city_id") String city_id,
            @Field("state_id") String state_id);

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<MemeberProfileResponse> GetMemberProfile(
            @Field("getProfile") String getProfile,
            @Field("user_id") String user_id,
            @Field("my_id") String my_id);

    @FormUrlEncoded
    @POST("geo_tag_controller.php")
    Single<GeoTagResponse> getGeoMembersNew(
            @Field("getGeoMembersNew") String getGeoMembersNew,
            @Field("user_id") String user_id,
            @Field("city_id") String city_id,
            @Field("city_name") String city_name,
            @Field("user_latitude") String user_latitude,
            @Field("user_longitude") String user_longitude
    );

    @FormUrlEncoded
    @POST("member_controller.php")
    Single<ViewMemberListResponse> getMembersFilter(
            @Field("getMembersFilter") String getMembersFilter,
            @Field("user_id") String user_id,
            @Field("business_category_id") String business_category_id,
            @Field("business_sub_category_id") String business_sub_category_id,
            @Field("city_id") String city_id,
            @Field("state_id") String state_id,
            @Field("zoobiz_id") String zoobiz_id,
            @Field("user_full_name") String user_full_name,
            @Field("user_email") String user_email,
            @Field("user_mobile") String user_mobile,
            @Field("search_keyword") String search_keyword);

    @FormUrlEncoded
    @POST("member_controller.php")
    Single<ViewMemberListResponse> getMembersFilterMap(
            @Field("getMembersFilterMap") String getMembersFilterMap,
            @Field("user_id") String user_id,
            @Field("city_name") String city_name,
            @Field("user_latitude") String user_latitude,
            @Field("user_longitude") String user_longitude,
            @Field("kmarea") String kmarea,
            @Field("business_category_id") String business_category_id,
            @Field("business_sub_category_id") String business_sub_category_id);

    @FormUrlEncoded
    @POST("geo_tag_controller.php")
    Single<GeoTagResponse> getGeoMembersFilter(
            @Field("getGeoMembersFilter") String getGeoMembersFilter,
            @Field("user_id") String user_id,
            @Field("business_category_id") String business_category_id,
            @Field("business_sub_category_id") String business_sub_category_id,
            @Field("city_id") String city_id,
            @Field("state_id") String state_id,
            @Field("zoobiz_id") String zoobiz_id,
            @Field("user_full_name") String user_full_name,
            @Field("user_email") String user_email,
            @Field("user_mobile") String user_mobile,
            @Field("search_keyword") String search_keyword,
            @Field("user_latitude") String user_latitude,
            @Field("user_longitude") String user_longitude
    );

    @FormUrlEncoded
    @POST("check_login_controller.php")
    Single<CheckLoginResponse> check_login(
            @Field("check_login") String check_login,
            @Field("user_id") String user_id,
            @Field("user_mobile") String user_mobile,
            @Field("device") String device,
            @Field("user_token") String user_token,
            @Field("version_code") String version_code);

    @FormUrlEncoded
    @POST("check_login_controller.php")
    Single<CommonResponse> setUsage(
            @Field("setUsage") String setUsage,
            @Field("user_id") String user_id,
            @Field("device") String device,
            @Field("phone_model") String phone_model,
            @Field("phone_brand") String phone_brand,
            @Field("version_code") String version_code);

    @FormUrlEncoded
    @POST("follow_controller.php")
    Single<FollowingDetailsResponse> getFollowDetails(
            @Field("getFollowDetails") String getFollowDetails,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<CommonResponse> blockUser(
            @Field("blockUser") String blockUser,
            @Field("user_id") String user_id,
            @Field("my_id") String my_id);

    @FormUrlEncoded
    @POST("user_controller.php")
    Single<CommonResponse> blockUnUser(
            @Field("blockUnUser") String blockUnUser,
            @Field("user_id") String user_id,
            @Field("my_id") String my_id);


    @FormUrlEncoded
    @POST("register_controller.php")
    Single<CommonResponse> registerUserTemp(@Field("user_register_temp") String user_register_temp,
                                            @Field("salutation") String salutation,
                                            @Field("user_first_name") String user_first_name,
                                            @Field("user_last_name") String user_last_name,
                                            @Field("member_date_of_birth") String member_date_of_birth,
                                            @Field("whatsapp_number") String whatsapp_number,
                                            @Field("userMobile") String userMobile,
                                            @Field("user_email") String user_email,
                                            @Field("gender") String gender,
                                            @Field("plan_id") String plan_id,
                                            @Field("company_name") String company_name,
                                            @Field("business_category_id") String business_category_id,
                                            @Field("business_sub_category_id") String business_sub_category_id,
                                            @Field("designation") String designation,
                                            @Field("company_website") String company_website,
                                            @Field("adress") String adress,
                                            @Field("area_id") String area_id,
                                            @Field("city_id") String city_id,
                                            @Field("state_id") String state_id,
                                            @Field("country_id") String country_id,
                                            @Field("pincode") String pincode,
                                            @Field("latitude") String latitude,
                                            @Field("longitude") String longitude,
                                            @Field("gst_number") String gst_number
    );

    @FormUrlEncoded
    @POST("register_controller.php")
    Single<TempUserRegisterResponse> NewregisterUserTemp(@Field("user_register_temp") String user_register_temp,
                                                         @Field("salutation") String salutation,
                                                         @Field("user_first_name") String user_first_name,
                                                         @Field("user_last_name") String user_last_name,
                                                         @Field("member_date_of_birth") String member_date_of_birth,
                                                         @Field("whatsapp_number") String whatsapp_number,
                                                         @Field("userMobile") String userMobile,
                                                         @Field("user_email") String user_email,
                                                         @Field("gender") String gender,
                                                         @Field("city_id") String city_id,
                                                         @Field("plan_id") String plan_id,
                                                         @Field("refer_type") String refer_type,
                                                         @Field("refer_friend_name") String refer_friend_name,
                                                         @Field("refer_friend_no") String refer_friend_no,
                                                         @Field("refer_remark") String refer_remark,
                                                         @Field("coupon_code") String coupon_code,
                                                         @Field("apply_coupon") boolean apply_coupon);


    @FormUrlEncoded
    @POST("register_controller.php")
    Single<CommonResponse> registerUser(@Field("user_register") String user_register,
                                        @Field("salutation") String salutation,
                                        @Field("user_first_name") String user_first_name,
                                        @Field("user_last_name") String user_last_name,
                                        @Field("userMobile") String userMobile,
                                        @Field("user_email") String user_email,
                                        @Field("gender") String gender,
                                        @Field("plan_id") String plan_id,
                                        @Field("plan_with_gst_amount") String planwithGstAmount,
                                        @Field("city_id") String city_id,
                                        @Field("razorpay_payment_id") String razorpay_payment_id,
                                        @Field("razorpay_order_id") String razorpay_order_id,
                                        @Field("razorpay_signature") String razorpay_signature,
                                        @Field("refer_type") String refer_type,
                                        @Field("refer_friend_name") String refer_friend_name,
                                        @Field("refer_friend_no") String refer_friend_no,
                                        @Field("refer_remark") String refer_remark,
                                        @Field("coupon_code") String coupon_code,
                                        @Field("apply_coupon") boolean apply_coupon);

    @Multipart
    @POST("register_controller.php")
    Single<LoginResponse> complete_profile(
            @Part("complete_profile") RequestBody complete_profile,
            @Part("user_id") RequestBody user_id,
            @Part("salutation") RequestBody salutation,
            @Part("user_first_name") RequestBody user_first_name,
            @Part("user_last_name") RequestBody user_last_name,
            @Part("member_date_of_birth") RequestBody member_date_of_birth,
            @Part("whatsapp_number") RequestBody whatsapp_number,
            @Part("userMobile") RequestBody userMobile,
            @Part("user_email") RequestBody user_email,
            @Part("gender") RequestBody gender,
            @Part("plan_id") RequestBody plan_id,
            @Part("company_name") RequestBody company_name,
            @Part("business_category_id") RequestBody business_category_id,
            @Part("business_sub_category_id") RequestBody business_sub_category_id,
            @Part("designation") RequestBody designation,
            @Part("company_website") RequestBody company_website,
            @Part("adress") RequestBody adress,
            @Part("area_id") RequestBody area_id,
            @Part("city_id") RequestBody city_id,
            @Part("state_id") RequestBody state_id,
            @Part("country_id") RequestBody country_id,
            @Part("pincode") RequestBody pincode,
            @Part("latitude") RequestBody latitude,
            @Part("longitude") RequestBody longitude,
            @Part("gst_number") RequestBody gst_number,
            @Part MultipartBody.Part user_profile_pic);

    @FormUrlEncoded
    @POST("visiting_card_controller.php")
    Single<CardResponse> getCardsResponse(
            @Field("getCard") String getCard,
            @Field("society_id") String socifety_id);

    @FormUrlEncoded
    @POST("utilityController.php")
    Single<FramesResponse> getFrames(
            @Field("getFrames") String getFrames,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("utilityController.php")
    Single<FrameImagesResponse> getFrameImages(
            @Field("getFrameImages") String getFrameImages,
            @Field("user_id") String user_id,
            @Field("frame_id") String frame_id);

    @FormUrlEncoded
    @POST("utilityController.php")
    Single<FrameAndImagesResponse> getFramesAndImages(
            @Field("getFramesAndImages") String getFramesAndImages,
            @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("check_coupon_validity.php")
    Single<CommonResponse> getValidCupon(
            @Field("couponCodeValidity") String couponCodeValidity,
            @Field("coupon_code") String coupon_code);


    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<ClassifiedCategoryResponse> getClassifiedCat(@Field("getCllassifiedCategories") String getCllassifiedCategories);


    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<CllassifiedSubCategoriesResponse> getCllassifiedSubCategories(@Field("getCllassifiedSubCategories") String getCllassifiedSubCategories,
                                                                                               @Field("business_category_id") String business_category_id);

    @FormUrlEncoded
    @POST("business_promition_controller.php")
    Single<PromitionEventListResponse> getPromitionEventData(
            @Field("getEventData") String getEventData,
            @Field("user_id")String user_id);

    @FormUrlEncoded
    @POST("business_promition_controller.php")
    Single<centerImageDetailsResponse> getCenterImages(
            @Field("getCenterImages") String getCenterImages,
            @Field("promotion_id")String promotion_id,
            @Field("promotion_frame_id")String promotion_frame_id);
/*
    @FormUrlEncoded
    @POST("cllassifiedController.php")
    Single<ClassifiedCategoryResponse> getClassifiedCategory(
            @Field("getCllassifiedCategories") String getCllassifiedCategories);*/
}
