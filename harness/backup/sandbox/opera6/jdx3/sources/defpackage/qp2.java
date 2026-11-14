package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.i;
import com.google.android.gms.tasks.OnFailureListener;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.io.EOFException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.text.c;
import org.chromium.net.GURLUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class qp2 implements p9n, xjj, jtl, xsi, vc3, lo7, OnFailureListener, bcf, jr9 {
    public final /* synthetic */ byte a;

    public /* synthetic */ qp2(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void c() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void e(long j, Object obj) throws EOFException {
        throw new EOFException("\\n not found: limit=" + j + ((Object) " content=") + obj + (char) 8230);
    }

    public static /* synthetic */ void f(Fragment fragment, String str) {
        throw new IllegalStateException(str + ((Object) fragment.toString()) + ((Object) " is already attached to a FragmentManager."));
    }

    public static /* synthetic */ void g(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void j(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void l(Object obj, String str) throws SSLPeerUnverifiedException {
        throw new SSLPeerUnverifiedException(str + obj);
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void o(String str) {
        throw new IllegalArgumentException(str);
    }

    public final Object apply(Object obj) {
        return GURLUtils.getOrigin((String) obj);
    }

    @Override // defpackage.xsi
    public final void b(MenuItem menuItem, boolean z) {
        menuItem.setVisible(!z);
    }

    @Override // defpackage.vc3
    public final boolean d(int i) {
        return true;
    }

    @Override // defpackage.p9n
    public final void h(View view) {
        ((AutoCompleteTextView) view).dismissDropDown();
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        switch (this.a) {
            case 1:
                pq2 pq2Var = (pq2) iVar;
                ru2 ru2Var = ((qq2) obj).a;
                vs vsVar = pq2Var.b;
                ChromiumContent chromiumContent = pq2Var.c;
                int i = ru2Var.d;
                String str = ru2Var.b;
                lxh lxhVarB0 = j14.b0(chromiumContent, i);
                if (lxhVarB0 != null) {
                    ((ImageView) vsVar.d).setImageDrawable(lxhVarB0.f(((FrameLayout) vsVar.b).getContext()));
                    ((ImageView) vsVar.d).setVisibility(0);
                }
                pq2Var.f = ru2Var;
                TextView textView = (TextView) vsVar.e;
                TextView textView2 = (TextView) vsVar.c;
                textView.setText(ru2Var.c);
                if (pq2Var.e == 5 && ru2Var.e != 43) {
                    textView2.setText(c.n(Math.max(5, str.length()), "*"));
                    break;
                } else {
                    textView2.setText(str);
                    break;
                }
                break;
            default:
                jv2 jv2Var = (jv2) iVar;
                pc pcVar = ((kv2) obj).a;
                if (pcVar != jv2Var.e) {
                    ((OperaTextView) jv2Var.b.d).setSelected(true);
                    jv2Var.e = pcVar;
                    jv2Var.U();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0153 A[PHI: r1
      0x0153: PHI (r1v23 int) = (r1v22 int), (r1v24 int), (r1v25 int), (r1v26 int) binds: [B:35:0x0105, B:37:0x0111, B:39:0x011c, B:41:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9 A[PHI: r1
      0x01c9: PHI (r1v14 int) = (r1v13 int), (r1v15 int) binds: [B:57:0x0186, B:59:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0246 A[PHI: r1
      0x0246: PHI (r1v4 int) = (r1v3 int), (r1v5 int), (r1v6 int), (r1v8 int), (r1v9 int) binds: [B:75:0x01ed, B:77:0x01fa, B:79:0x0207, B:83:0x021d, B:85:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.jtl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(android.view.LayoutInflater r18, android.view.ViewGroup r19) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp2.k(android.view.LayoutInflater, android.view.ViewGroup):java.lang.Object");
    }

    public final g3o l0(View view, g3o g3oVar) {
        p37.q0(g3oVar.a.i(519).b, view);
        return g3oVar;
    }

    public final void onFailure(Exception exc) {
    }

    @Override // defpackage.lo7
    public final no7 x(Context context) {
        return new zi3(context, 17, "blocklist_manifest");
    }
}
