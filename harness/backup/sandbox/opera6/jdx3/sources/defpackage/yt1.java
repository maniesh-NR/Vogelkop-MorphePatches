package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class yt1 implements zt1 {
    public final String a;
    public final zyk b;
    public final zyk c;

    public yt1(String str) {
        this.a = str;
        final byte b = 0;
        this.b = z4c.b(new Function0(this) { // from class: xt1
            public final /* synthetic */ yt1 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                Uri uri;
                Uri uriNormalizeScheme;
                String scheme;
                byte b2 = b;
                yt1 yt1Var = this.b;
                switch (b2) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) yt1Var.c.getValue()).booleanValue();
                        String str2 = yt1Var.a;
                        return !zBooleanValue ? str2.length() == 0 ? "" : sko.j("opera-user://", Base64.encodeToString(str2.getBytes(Charsets.UTF_8), 10)) : str2;
                    default:
                        String str3 = yt1Var.a;
                        if (str3.length() <= 0) {
                            str3 = null;
                        }
                        return Boolean.valueOf((str3 == null || (uri = Uri.parse(str3)) == null || (uriNormalizeScheme = uri.normalizeScheme()) == null || (scheme = uriNormalizeScheme.getScheme()) == null) ? false : new Regex("https?").j(scheme));
                }
            }
        });
        final byte b2 = 1;
        this.c = z4c.b(new Function0(this) { // from class: xt1
            public final /* synthetic */ yt1 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                Uri uri;
                Uri uriNormalizeScheme;
                String scheme;
                byte b22 = b2;
                yt1 yt1Var = this.b;
                switch (b22) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) yt1Var.c.getValue()).booleanValue();
                        String str2 = yt1Var.a;
                        return !zBooleanValue ? str2.length() == 0 ? "" : sko.j("opera-user://", Base64.encodeToString(str2.getBytes(Charsets.UTF_8), 10)) : str2;
                    default:
                        String str3 = yt1Var.a;
                        if (str3.length() <= 0) {
                            str3 = null;
                        }
                        return Boolean.valueOf((str3 == null || (uri = Uri.parse(str3)) == null || (uriNormalizeScheme = uri.normalizeScheme()) == null || (scheme = uriNormalizeScheme.getScheme()) == null) ? false : new Regex("https?").j(scheme));
                }
            }
        });
    }

    public final Drawable a(int i, Context context) {
        boolean zBooleanValue = ((Boolean) this.c.getValue()).booleanValue();
        String strJ = this.a;
        if (!zBooleanValue) {
            strJ = sko.j("https://", strJ);
        }
        String str = strJ;
        int i2 = vmj.g;
        vmj vmjVarM = tmj.m(context, str, i, i, null, 48);
        vmjVarM.setBounds(0, 0, i, i);
        return vmjVarM;
    }

    @Override // defpackage.zt1
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.zt1
    public final String o() {
        return (String) this.b.getValue();
    }
}
