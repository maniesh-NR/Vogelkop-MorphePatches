package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class opm {
    public static final Pattern a = Pattern.compile("[\\/?#]");

    public static fr a(String str) {
        Uri uriNormalizeScheme = Uri.parse(str).normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        if (!Constants.Params.DATA.equals(scheme) && !"file".equals(scheme) && !"javascript".equals(scheme)) {
            if ("blob".equals(scheme)) {
                int length = scheme.length() + 1;
                fr frVarA = a(str.substring(length));
                if (frVarA == null) {
                    return null;
                }
                return new fr(frVarA.b + length, length + frVarA.c, (byte) 26);
            }
            String encodedAuthority = uriNormalizeScheme.getEncodedAuthority();
            if (!TextUtils.isEmpty(encodedAuthority)) {
                int iIndexOf = str.indexOf(encodedAuthority);
                if (iIndexOf == -1) {
                    return null;
                }
                int length2 = encodedAuthority.length();
                String encodedUserInfo = uriNormalizeScheme.getEncodedUserInfo();
                if (!TextUtils.isEmpty(encodedUserInfo)) {
                    int length3 = encodedUserInfo.length() + 1;
                    iIndexOf += length3;
                    length2 -= length3;
                }
                int length4 = encodedAuthority.length() - 1;
                while (length4 >= 0) {
                    char cCharAt = encodedAuthority.charAt(length4);
                    if (':' == cCharAt) {
                        break;
                    }
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    length4--;
                }
                length4 = -1;
                if (length4 != -1) {
                    length2 -= encodedAuthority.length() - length4;
                }
                return new fr(iIndexOf, length2 + iIndexOf, (byte) 26);
            }
            if (!TextUtils.isEmpty(scheme)) {
                Matcher matcher = a.matcher(str);
                return matcher.find(scheme.length()) ? new fr(scheme.length() + 1, matcher.start(), (byte) 26) : new fr(scheme.length() + 1, str.length(), (byte) 26);
            }
        }
        return null;
    }
}
