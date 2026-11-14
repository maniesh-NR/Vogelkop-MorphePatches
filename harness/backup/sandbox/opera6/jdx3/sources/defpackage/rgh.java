package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.browser.TabInfo;
import com.opera.android.widget.UrlFieldEditText;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rgh implements uu5, bnj, n8k, x9l, gi2, bcf, nxi, ylo {
    public Object a;
    public Object b;

    public /* synthetic */ rgh(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ rgh(Object obj, Object obj2, boolean z) {
        this.a = obj2;
        this.b = obj;
    }

    public rgh(pt1 pt1Var) {
        this.a = pt1Var;
        ((ImageView) pt1Var.f).setBackground(new qgh(true));
        ((ImageView) pt1Var.g).setBackground(new qgh(false));
        n(0, true);
        n(0, false);
    }

    @Override // defpackage.x9l
    public final ikc C() {
        return (pde) ((p9l) this.a).m;
    }

    @Override // defpackage.x9l
    public final boolean D(int i) {
        ((p9l) this.a).D(i);
        return true;
    }

    @Override // defpackage.x9l
    public final b2l E(int i) {
        return ((p9l) this.a).E(i);
    }

    @Override // defpackage.bnj
    public final void F(Bitmap bitmap) {
        i3j i3jVar = (i3j) this.a;
        ((umi) i3jVar.d).e(new mgf((Object) i3jVar, (Object) bitmap, (byte) 25)).c(new o62((Function1) this.b, (byte) 1)).a(bitmap, null);
    }

    @Override // defpackage.w9l
    public final void L(Long l) {
        ((p9l) this.a).L(l);
    }

    @Override // defpackage.x9l
    public final void N(z3 z3Var) {
        ((p9l) this.a).N(z3Var);
    }

    @Override // defpackage.x9l
    public final void O(Iterable iterable, boolean z, boolean z2) {
        ((p9l) this.a).O(iterable, false, z2);
    }

    @Override // defpackage.x9l
    public final void P(Integer num, Set set, vr0 vr0Var) {
        ((p9l) this.a).P(num, set, vr0Var);
    }

    @Override // defpackage.x9l
    public final boolean X(List list) {
        return ((p9l) this.a).X(list);
    }

    public final Object a() {
        return new mgh((h61) this.a, (ylo) this.b, (byte) 13);
    }

    @Override // defpackage.n8k
    public final void b(q8l q8lVar) {
        w6j w6jVar = (w6j) this.a;
        if (((knf) w6jVar.d) != ((n4k) this.b)) {
            return;
        }
        ((d7l) w6jVar.e).p0();
    }

    @Override // defpackage.n8k
    public final void c(yul yulVar) {
        w6j w6jVar = (w6j) this.a;
        if (((knf) w6jVar.d) != ((n4k) this.b)) {
            return;
        }
        ((BrowserFragment) ((d7l) w6jVar.e).d.b).getActivity().a0(yulVar);
    }

    @Override // defpackage.nxi
    public final int d(int i) {
        CharSequence charSequence = (CharSequence) this.a;
        do {
            i = ((i1) this.b).D(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.x9l
    public final void d0(b2l b2lVar) {
        ((p9l) this.a).d0(b2lVar);
    }

    public final void e(int i, View view) {
        if (view.isLaidOut()) {
            view.animate().alpha(0.0f).setDuration(i).setInterpolator(lf1.a).setListener(new c48((byte) 8, view, this));
        } else {
            view.setAlpha(0.0f);
            view.setVisibility(8);
        }
    }

    @Override // defpackage.bnj
    public final void f(boolean z) {
        ((Function1) this.b).invoke((Object) null);
    }

    @Override // defpackage.nxi
    public final int g(int i) {
        do {
            i = ((i1) this.b).R(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.a).charAt(i)));
        return i;
    }

    @Override // defpackage.x9l
    public final void g0(Set set, pdb pdbVar, vr0 vr0Var, boolean z) {
        ((p9l) this.a).g0(set, pdbVar, vr0Var, z);
    }

    @Override // defpackage.nxi
    public final int h(int i) {
        do {
            i = ((i1) this.b).D(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.a).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.w9l
    public final b2l h0(b2l b2lVar, TabInfo tabInfo) {
        return ((p9l) this.a).h0(b2lVar, tabInfo);
    }

    public final void i(int i, View view) {
        view.animate().alpha(1.0f).setDuration(i).setInterpolator(lf1.a).setListener(new c48((byte) 7, view, this));
    }

    public final int j(boolean z, boolean z2) {
        pt1 pt1Var = (pt1) this.a;
        float alpha = z ? ((TextView) pt1Var.c).getAlpha() : ((TextView) pt1Var.b).getAlpha();
        return z2 ? (int) ((1.0f - alpha) * 300.0f) : (int) (alpha * 300.0f);
    }

    @Override // defpackage.w9l
    public final b2l j0(p6l p6lVar, TabInfo tabInfo) {
        return ((p9l) this.a).j0(p6lVar, tabInfo);
    }

    @Override // defpackage.w9l
    public final b2l k(p6l p6lVar) {
        return ((p9l) this.a).k(p6lVar);
    }

    @Override // defpackage.x9l
    public final void k0() {
        ((p9l) this.a).k0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r13 == r2) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.uu5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(nyb r12, mt5 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgh.l(nyb, mt5):java.lang.Object");
    }

    public final g3o l0(View view, g3o g3oVar) {
        o9n o9nVar = (o9n) this.a;
        sv2 sv2Var = (sv2) this.b;
        sv2 sv2Var2 = new sv2();
        sv2Var2.a = sv2Var.a;
        sv2Var2.b = sv2Var.b;
        sv2Var2.c = sv2Var.c;
        return o9nVar.m(view, g3oVar, sv2Var2);
    }

    @Override // defpackage.x9l
    public final void m(b2l b2lVar) {
        ((p9l) this.a).m(b2lVar);
    }

    @Override // defpackage.x9l
    public final void m0(LinkedHashSet linkedHashSet) {
        ((p9l) this.a).m0(linkedHashSet);
    }

    public final void n(int i, boolean z) {
        pt1 pt1Var = (pt1) this.a;
        if (z) {
            e(i, (TextView) pt1Var.c);
            e(i, (ImageView) pt1Var.f);
        } else {
            e(i, (TextView) pt1Var.b);
            e(i, (ImageView) pt1Var.g);
        }
    }

    @Override // defpackage.x9l
    public final void o() {
        ((p9l) this.a).o();
    }

    @Override // defpackage.x9l
    public final void o0(Iterable iterable, boolean z, boolean z2) {
        ((p9l) this.a).o0(iterable, false, z2);
    }

    @Override // defpackage.gi2
    public final void p(String str, s14 s14Var) {
        ((sa4) this.b).b(new jbd((c5o) this.a, str, s14Var, (byte) 28));
    }

    @Override // defpackage.x9l
    public final void p0(int i) {
        ((p9l) this.a).p0(i);
    }

    public final void q(Context context, cue cueVar, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "__sd";
        }
        tu3 tu3Var = "__sd".equals(str) ? new tu3(wqm.d("startpage"), d5k.c(context), (byte) 1) : "topnews".equals(str) ? new tu3(d5k.b(cueVar, "topnews"), d5k.c(context), (byte) 1) : new tu3(d5k.b(cueVar, str), d5k.c(context), (byte) 1);
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.b = arrayList;
        }
        arrayList.add(tu3Var);
    }

    @Override // defpackage.nxi
    public final int r(int i) {
        do {
            i = ((i1) this.b).R(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.a).charAt(i - 1)));
        return i;
    }

    public final void s() {
        BackgroundColorSpan backgroundColorSpan;
        bq1 bq1Var = (UrlFieldEditText) this.a;
        if (bq1Var.isFocused()) {
            bq1Var.setCursorVisible(true);
        }
        Editable editableText = bq1Var.getEditableText();
        int spanStart = (editableText == null || (backgroundColorSpan = (BackgroundColorSpan) this.b) == null) ? -1 : editableText.getSpanStart(backgroundColorSpan);
        if (spanStart == -1) {
            return;
        }
        editableText.removeSpan((BackgroundColorSpan) this.b);
        editableText.delete(spanStart, editableText.length());
        this.b = null;
    }

    @Override // defpackage.x9l
    public final void w(LinkedHashSet linkedHashSet) {
        ((p9l) this.a).w(linkedHashSet);
    }

    @Override // defpackage.w9l
    public final void y() {
        ((p9l) this.a).y();
    }
}
