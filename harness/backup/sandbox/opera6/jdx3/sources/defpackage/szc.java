package defpackage;

import com.leanplum.internal.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class szc {
    public static final /* synthetic */ szc[] b;
    public static final /* synthetic */ h58 c;
    public final String a;

    static {
        szc[] szcVarArr = {new szc("ORIGIN_URL", 0, "origin_url"), new szc("ACTION_URL", 1, "action_url"), new szc("USERNAME_ELEMENT", 2, "username_element"), new szc("USERNAME_VALUE", 3, "username_value"), new szc("PASSWORD_ELEMENT", 4, "password_element"), new szc("PASSWORD_VALUE", 5, "password_value"), new szc("SUBMIT_ELEMENT", 6, "submit_element"), new szc("SIGNON_REALM", 7, "signon_realm"), new szc("DATE_CREATED", 8, "date_created"), new szc("BLOCKLISTED_BY_USER", 9, "blacklisted_by_user"), new szc("SCHEME", 10, "scheme"), new szc("PASSWORD_TYPE", 11, "password_type"), new szc("TIMES_USED", 12, "times_used"), new szc("FORM_DATA", 13, "form_data"), new szc("DISPLAY_NAME", 14, "display_name"), new szc("ICON_URL", 15, Constants.Keys.PUSH_MESSAGE_ICON_URL), new szc("FEDERATION_URL", 16, "federation_url"), new szc("SKIP_ZERO_CLICK", 17, "skip_zero_click"), new szc("GENERATION_UPLOAD_STATUS", 18, "generation_upload_status"), new szc("POSSIBLE_USERNAME_PAIRS", 19, "possible_username_pairs"), new szc("ID", 20, "id"), new szc("DATE_LAST_USED", 21, "date_last_used"), new szc("MOVING_BLOCKED_FOR", 22, "moving_blocked_for"), new szc("DATE_PASSWORD_MODIFIED", 23, "date_password_modified"), new szc("SENDER_EMAIL", 24, "sender_email"), new szc("SENDER_NAME", 25, "sender_name"), new szc("DATE_RECEIVED", 26, "date_received"), new szc("SHARING_NOTIFICATION_DISPLAYED", 27, "sharing_notification_displayed"), new szc("KEYCHAIN_IDENTIFIER", 28, "keychain_identifier"), new szc("SENDER_PROFILE_IMAGE_URL", 29, "sender_profile_image_url"), new szc("DATE_LAST_FILLED", 30, "date_last_filled"), new szc("ACTOR_LOGIN_APPROVED", 31, "actor_login_approved")};
        b = szcVarArr;
        c = new h58(szcVarArr);
    }

    public szc(String str, int i, String str2) {
        this.a = str2;
    }

    public static szc valueOf(String str) {
        return (szc) Enum.valueOf(szc.class, str);
    }

    public static szc[] values() {
        return (szc[]) b.clone();
    }
}
