package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u92 extends w92 {
    public static final Set e = e82.E(new String[]{"application/json", "application/pdf", "image/*", "video/*", "audio/*", "text/css", "text/html", "text/javascript", "text/xml", "text/csv", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "text/plain"});
    public final Uri a;
    public final o29 b;
    public final String c;
    public final String d;

    public u92(Uri uri, o29 o29Var, String str, String str2) {
        this.a = uri;
        this.b = o29Var;
        this.c = str2;
        if (Intrinsics.a(str, "application/octet-stream")) {
            switch (o29Var.ordinal()) {
                case 0:
                case 2:
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                case 12:
                case 14:
                    HashSet hashSet = s29.a;
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str2.toLowerCase(Locale.US));
                    if (mimeTypeFromExtension != null) {
                        str = mimeTypeFromExtension;
                        break;
                    }
                    break;
                case 1:
                case 3:
                case 4:
                case 5:
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                case 11:
                case 13:
                    break;
                case 6:
                    str = "text/plain";
                    break;
                case 7:
                    str = "text/html";
                    break;
                case 8:
                    str = "application/pdf";
                    break;
                default:
                    h9o.p();
                    throw null;
            }
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u92.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        u92 u92Var = (u92) obj;
        return Intrinsics.a(this.a, u92Var.a) && this.b == u92Var.b && this.c.equals(u92Var.c) && Intrinsics.a(this.d, u92Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z1m.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
