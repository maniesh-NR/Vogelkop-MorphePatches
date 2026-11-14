package defpackage;

import J.N;
import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.opera.android.OperaApplication;
import com.opera.android.browser.autofill.SaveCardDialogRequest;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class rii implements re, mya, rr9, hpf, rba, n5o, mf1, gln, f2o, bpo, jrp {
    public final /* synthetic */ byte a;
    public final Object b;

    public rii() {
        this.a = (byte) 27;
        this.b = new Rect();
    }

    public rii(float f, float f2, if1 if1Var) {
        this.a = (byte) 16;
        int iB = if1Var.b();
        w89[] w89VarArr = new w89[iB];
        for (int i = 0; i < iB; i++) {
            w89VarArr[i] = new w89(f, f2, if1Var.a(i));
        }
        this.b = w89VarArr;
    }

    public rii(WebView webView, auj aujVar) {
        this.a = (byte) 24;
        zch.d(webView, "WebView is null");
        this.b = webView;
    }

    public /* synthetic */ rii(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public rii(ArrayList arrayList) {
        this.a = (byte) 6;
        this.b = Collections.unmodifiableList(arrayList);
    }

    public rii(tu tuVar, vqi vqiVar) {
        this.a = (byte) 1;
        this.b = tuVar;
    }

    public rii(w6j w6jVar, ctl ctlVar) {
        this.a = (byte) 13;
        this.b = xf8.z(ctlVar.e, (pde) w6jVar.c, new sul((byte) 1));
    }

    public static o1 l(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return null;
        }
        int iIndexOf = TextUtils.indexOf(charSequence, "{{", i);
        if (iIndexOf == -1) {
            int iIndexOf2 = TextUtils.indexOf(charSequence, "}}", i);
            if (iIndexOf2 == -1) {
                return null;
            }
            Locale locale = Locale.US;
            throw new eel(sko.i(iIndexOf2, "End tag with no start tag at index "));
        }
        int i2 = iIndexOf + 2;
        int iIndexOf3 = TextUtils.indexOf(charSequence, "}}", i2);
        if (iIndexOf3 == -1) {
            Locale locale2 = Locale.US;
            throw new eel(sko.i(iIndexOf, "Start tag with no end tag at index "));
        }
        String strTrim = TextUtils.substring(charSequence, i2, iIndexOf3).trim();
        if (!strTrim.isEmpty() && !strTrim.contains("{{") && !strTrim.contains("}}")) {
            return new o1(strTrim, iIndexOf, (iIndexOf3 + 2) - iIndexOf, (byte) 6);
        }
        Locale locale3 = Locale.US;
        throw new eel(sko.i(iIndexOf, "Invalid argument at index "));
    }

    private final void w(Throwable th) {
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        dyk dykVar = (dyk) this.b;
        dykVar.h.c(fpfVar.d, new eof((Object) dykVar, (Object) fpfVar, (byte) 28));
    }

    @Override // defpackage.bpo
    public final void a() {
    }

    @Override // defpackage.bpo
    public final void a(String str) {
        ((u6p) ((ny3) this.b).e).invoke(str);
    }

    @Override // defpackage.bpo
    public final void b() {
    }

    @Override // defpackage.bpo
    public final void c() {
    }

    @Override // defpackage.rba
    public final void d() {
        nv6 nv6VarB = ((ru9) ((ioc) this.b).e).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("tab_gallery.gallery_button_hint_bubble_shown", true);
        nv6VarB.w();
    }

    @Override // defpackage.gln
    public final void e(ArrayList arrayList) {
        vq8 vq8Var = (vq8) this.b;
        vq8Var.l = null;
        ((kze) vq8Var.j).r(arrayList);
        ((vl9) vq8Var.k).run();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.view.View r6, android.view.View r7, int r8, int r9, java.lang.Integer r10) {
        /*
            r5 = this;
            java.lang.Object r5 = r5.b
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            r0 = 0
            if (r7 == 0) goto L71
            int r1 = r7.getVisibility()
            if (r1 != 0) goto L71
            if (r6 == 0) goto L15
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L71
        L15:
            boolean r6 = r7.isShown()
            if (r6 == 0) goto L71
            boolean r6 = r7.getGlobalVisibleRect(r5)
            if (r6 == 0) goto L71
            int r6 = r5.height()
            long r1 = (long) r6
            int r5 = r5.width()
            long r5 = (long) r5
            long r1 = r1 * r5
            int r5 = r7.getHeight()
            long r5 = (long) r5
            int r7 = r7.getWidth()
            long r3 = (long) r7
            long r5 = r5 * r3
            r3 = 0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L71
            r7 = 1
            if (r10 == 0) goto L50
            int r3 = r10.intValue()
            if (r3 <= 0) goto L50
            int r5 = r10.intValue()
            long r5 = (long) r5
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L71
            goto L70
        L50:
            r3 = 100
            long r1 = r1 * r3
            if (r9 <= 0) goto L6a
            long r9 = (long) r9
            long r9 = r9 * r5
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 > 0) goto L5d
            r9 = r7
            goto L5e
        L5d:
            r9 = r0
        L5e:
            if (r9 == 0) goto L63
            if (r9 != 0) goto L71
            goto L70
        L63:
            long r8 = (long) r8
            long r8 = r8 * r5
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 < 0) goto L71
            goto L70
        L6a:
            long r8 = (long) r8
            long r8 = r8 * r5
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 < 0) goto L71
        L70:
            return r7
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rii.f(android.view.View, android.view.View, int, int, java.lang.Integer):boolean");
    }

    public final Object g(Object obj) {
        String str = (String) obj;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((hlm) this.b).c.getValue()).edit();
        if (str == null) {
            editorEdit.remove("uid");
        } else {
            editorEdit.putString("uid", str);
        }
        editorEdit.apply();
        return null;
    }

    public final n89 get(int i) {
        return ((w89[]) this.b)[i];
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        ((dyk) this.b).n.r(new byk(null, null, null));
    }

    public void i() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public final boolean j() {
        String string = ((SharedPreferences) ((a12) this.b).b.get()).getString("ofa-migration-version", null);
        Integer intOrNull = string != null ? StringsKt.toIntOrNull(string) : null;
        return intOrNull == null || intOrNull.intValue() < 0;
    }

    public final boolean k(se seVar, MenuItem menuItem) {
        yyi yyiVar = (yyi) this.b;
        if (yyiVar.m == null) {
            return false;
        }
        return yyiVar.H0(menuItem);
    }

    @Override // defpackage.mya
    public final void m(Bitmap bitmap, boolean z) {
        ghf ghfVar = (ghf) this.b;
        ((q65) ghfVar.b).S();
        ((bnj) ghfVar.c).F(bitmap);
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
        ((dyk) this.b).n.r(ayk.a);
    }

    public final void o(pr prVar, hjm hjmVar) {
        vb0 vb0Var;
        SaveCardDialogRequest saveCardDialogRequest = (SaveCardDialogRequest) this.b;
        if (hjmVar == hjm.b) {
            vb0Var = vb0.d;
        } else {
            saveCardDialogRequest.a.e((String) prVar.e, (String) prVar.f);
            vb0Var = vb0.c;
        }
        Context context = saveCardDialogRequest.b;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).L().c.x0(vb0Var);
        N.MltfAxC5(saveCardDialogRequest.e);
    }

    @Override // defpackage.gln
    public final void onFailure() {
        vq8 vq8Var = (vq8) this.b;
        vq8Var.l = null;
        vq8Var.a = ((List) ((kze) vq8Var.j).g()).isEmpty();
        ((vl9) vq8Var.k).run();
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
        switch (this.a) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                break;
            default:
                ((cyd) this.b).e();
                break;
        }
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((ktk) this.b).run();
                break;
            default:
                break;
        }
    }

    public final void p(se seVar) {
        yyi yyiVar = (yyi) this.b;
        yyiVar.r.d();
        CollapsingToolbarLayout collapsingToolbarLayout = yyiVar.v;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setVisibility(0);
            return;
        }
        Toolbar toolbar = yyiVar.l;
        if (toolbar != null) {
            toolbar.setVisibility(0);
        }
    }

    public final boolean q(se seVar, itd itdVar) {
        yyi yyiVar = (yyi) this.b;
        if (yyiVar.u != 0) {
            seVar.d().inflate(yyiVar.u, itdVar);
        }
        seVar.d().inflate(2131755058, itdVar);
        CollapsingToolbarLayout collapsingToolbarLayout = yyiVar.v;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setVisibility(4);
            return true;
        }
        Toolbar toolbar = yyiVar.l;
        if (toolbar == null) {
            return true;
        }
        toolbar.setVisibility(4);
        return true;
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        ((dyk) this.b).n.r(ayk.a);
    }

    @Override // defpackage.rba
    public final void s() {
    }

    @Override // defpackage.rba
    public final void t() {
    }

    @Override // defpackage.mya
    public final void u(int i) {
        ghf ghfVar = (ghf) this.b;
        bnj bnjVar = (bnj) ghfVar.c;
        ((q65) ghfVar.b).S();
        int iA = vep.A(i);
        if (iA == 0) {
            bnjVar.f(false);
        } else if (iA == 1) {
            bnjVar.f(true);
        } else {
            if (iA != 2) {
                return;
            }
            bnjVar.f(false);
        }
    }

    public final boolean v(se seVar, itd itdVar) {
        yyi yyiVar = (yyi) this.b;
        tzi tziVar = yyiVar.r;
        int size = ((LinkedHashSet) tziVar.a.c).size();
        int i = tziVar.f;
        if (size != i || i <= 0) {
            seVar.m(yyiVar.getActivity().getResources().getQuantityString(2131886173, size, Integer.valueOf(size)));
        } else {
            seVar.m(yyiVar.getActivity().getString(2132021034));
        }
        MenuItem menuItemFindItem = itdVar.findItem(2131363484);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(i > 0 && size < i);
        }
        MenuItem menuItemFindItem2 = itdVar.findItem(2131363474);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(size > 0);
        }
        yyiVar.J0(itdVar, size);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final String x(String str) throws e22 {
        String strK;
        ewg ewgVarH;
        StringBuilder sb = new StringBuilder(str);
        int length = 0;
        while (true) {
            o1 o1VarL = l(length, sb);
            if (o1VarL == null) {
                return sb.toString();
            }
            int i = o1VarL.c;
            String str2 = o1VarL.b;
            u7k u7kVar = (u7k) this.b;
            int[] iArrB = vep.B(2);
            int length2 = iArrB.length;
            int i2 = 0;
            while (true) {
                strK = null;
                if (i2 >= length2) {
                    break;
                }
                int i3 = iArrB[i2];
                if (str2.startsWith(fki.h(i3))) {
                    String strSubstring = str2.substring(fki.h(i3).length());
                    a1b a1bVarU = ((csh) u7kVar.a).u(0);
                    a1bVarU.getClass();
                    while (true) {
                        if (!a1bVarU.hasNext()) {
                            ewgVarH = h3.a;
                            break;
                        }
                        Object next = a1bVarU.next();
                        amk amkVar = (amk) next;
                        if (amkVar != null && strSubstring.equals(amkVar.a.a)) {
                            ewgVarH = orf.h(next);
                            break;
                        }
                    }
                    if (ewgVarH.g()) {
                        amk amkVar2 = (amk) ewgVarH.d();
                        int iA = vep.A(i3);
                        if (iA == 0) {
                            strK = amkVar2.c.c.a;
                        } else if (iA == 1) {
                            strK = z7h.k(amkVar2.c.c.b, amkVar2.d);
                        }
                    }
                } else {
                    i2++;
                }
            }
            if (strK == null) {
                Locale locale = Locale.US;
                throw new e22("Unknown argument ".concat(str2));
            }
            sb.replace(i, o1VarL.d + i, strK);
            length = strK.length() + i;
        }
    }

    public void y() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view != null) {
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = view.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new ca(viewFindViewById, (byte) 6));
        }
    }

    @Override // defpackage.rba
    public final void z() {
    }

    @Override // defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File file = (File) ((jrp) this.b).mo1zza();
        irp irpVar = null;
        if (file == null) {
            return null;
        }
        g40 g40Var = top.c;
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return irp.c;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                top topVar = new top(xmlPullParserNewPullParser);
                topVar.a("local-testing-config", new bxk((Object) topVar, (byte) 23));
                wci wciVar = topVar.b;
                Map map = (Map) wciVar.c;
                if (map != null) {
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    if (mapUnmodifiableMap != null) {
                        wciVar.c = mapUnmodifiableMap;
                        irpVar = new irp((Integer) wciVar.b, (Map) wciVar.c);
                    } else {
                        t3p.q("Null splitInstallErrorCodeByModule");
                    }
                } else {
                    qp2.n("Property \"splitInstallErrorCodeByModule\" has not been set");
                }
                fileReader.close();
                return irpVar;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e) {
            top.c.e("%s can not be parsed, using default. Error: %s", new Object[]{"local_testing_config.xml", e.getMessage()});
            return irp.c;
        }
    }
}
