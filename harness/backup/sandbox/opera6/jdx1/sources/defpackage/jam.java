package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jam extends drj {
    @Override // defpackage.drj
    public final Font h(ni9 ni9Var) {
        Font fontF;
        Uri uri = ni9Var.a;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = ni9Var.e;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontF = ham.f(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontF;
                }
                try {
                    return new Font.Builder(fontF).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
