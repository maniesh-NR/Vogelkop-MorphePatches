package defpackage;

import J.N;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.opera.android.bar.FindInPage;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.FaqItemView;
import com.opera.hype.image.editor.TextBoxEditText;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class h63 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public h63(FaqItemView faqItemView, StylingTextView stylingTextView) {
        this.a = (byte) 1;
        this.b = stylingTextView;
    }

    public /* synthetic */ h63(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void A(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void j(Editable editable) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r7) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h63.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
                break;
            case 2:
                FindInPage findInPage = (FindInPage) obj;
                if (findInPage.d != null) {
                    String string = charSequence.toString();
                    if (!string.isEmpty()) {
                        findInPage.c = string;
                        findInPage.g = true;
                        zg zgVar = findInPage.d;
                        zgVar.c = string;
                        zgVar.a = N.MaMXv1PI((WebContents) zgVar.b, string, true, false);
                        break;
                    } else {
                        N.Mjhb9sjl((WebContents) findInPage.d.b);
                        findInPage.c = "";
                        findInPage.e = 0;
                        findInPage.f = 0;
                        findInPage.g();
                        break;
                    }
                }
                break;
            case 3:
                break;
            case 4:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.p.getText();
                searchView.W = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.s(!zIsEmpty);
                searchView.u(zIsEmpty);
                searchView.o();
                searchView.r();
                if (searchView.J != null && !TextUtils.equals(charSequence, searchView.V)) {
                    searchView.J.p(charSequence.toString());
                }
                searchView.V = charSequence.toString();
                break;
            case 5:
            case 6:
                break;
            case 7:
                ((TextBoxEditText) ((bfl) obj).d.e).requestLayout();
                break;
            case 8:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                break;
            default:
                kze kzeVar = (kze) ((nen) obj).a.c;
                kzeVar.r(oen.a((oen) kzeVar.g(), null, charSequence, 5));
                break;
        }
    }
}
