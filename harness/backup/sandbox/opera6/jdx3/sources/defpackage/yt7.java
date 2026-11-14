package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.inline.InlinePresentationSpec;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class yt7 implements yjj, xjj, h93, ee5, fjc, gjc, Continuation, p9n, ybc {
    public final /* synthetic */ byte a;

    public /* synthetic */ yt7(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ InlinePresentationSpec a(Object obj) {
        return (InlinePresentationSpec) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(int i, String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void e(Object obj, Object obj2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    public static /* synthetic */ void f(String str) throws FileNotFoundException {
        throw new FileNotFoundException(str);
    }

    public static /* synthetic */ void g(String str, Object obj, Throwable th) {
        throw new IllegalArgumentException(str + obj, th);
    }

    public static /* synthetic */ void j(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void k(String str) {
        throw new UnsupportedOperationException(str);
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                return new iu7(kf.h(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 1:
            default:
                return new pu7(kf.h(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 2:
                View viewN = j7c.n(viewGroup, 2131559170, viewGroup, false);
                int i = 2131362543;
                View viewJ = w1h.j(2131362543, viewN);
                if (viewJ != null) {
                    b98 b98Var = new b98((FrameLayout) viewJ, (byte) 3);
                    FrameLayout frameLayout = (FrameLayout) w1h.j(2131364081, viewN);
                    if (frameLayout != null) {
                        return new bu7(new ov0(viewN, (Object) b98Var, (Object) frameLayout, (byte) 25));
                    }
                    i = 2131364081;
                }
                t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i)));
                return null;
        }
    }

    @Override // defpackage.ybc
    public final String d(Context context) {
        switch (this.a) {
            case 27:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 28:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            default:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
        }
    }

    @Override // defpackage.p9n
    public final void h(View view) {
        WebView webView = (WebView) view;
        switch (this.a) {
            case 17:
                webView.onResume();
                break;
            default:
                webView.onPause();
                break;
        }
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        final byte b = 1;
        final byte b2 = 0;
        switch (this.a) {
            case 1:
                final du7 du7Var = (du7) obj;
                final hu7 hu7Var = (hu7) iVar;
                hu7Var.e = du7Var;
                hu7Var.U();
                ov0 ov0Var = hu7Var.b;
                ((b98) ov0Var.c).b.setOnClickListener(new View.OnClickListener() { // from class: gu7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object next;
                        byte b3 = b2;
                        du7 du7Var2 = du7Var;
                        hu7 hu7Var2 = hu7Var;
                        switch (b3) {
                            case 0:
                                hu7Var2.c.m(du7Var2.k);
                                break;
                            default:
                                x77 x77Var = hu7Var2.c;
                                String str = du7Var2.k;
                                ((lv7) x77Var.d).invoke();
                                wjh wjhVar = (wjh) x77Var.c;
                                hd hdVar = (hd) wjhVar.e;
                                Context context = ((RecyclerView) wjhVar.b).getContext();
                                Iterator it = ((Iterable) ((qde) hdVar.g).g()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (Intrinsics.a(((jx1) next).getId(), str)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                jx1 jx1Var = (jx1) next;
                                if (jx1Var != null) {
                                    if (!(jx1Var instanceof vx1)) {
                                        if (!(jx1Var instanceof fz1)) {
                                            h9o.p();
                                            break;
                                        }
                                    } else {
                                        wxe wxeVar = ((vx1) jx1Var).b;
                                        if (wxeVar instanceof qx1) {
                                            qx1 qx1Var = (qx1) wxeVar;
                                            Uri uriX = w7d.x(qx1Var.m);
                                            Intent intent = new Intent("android.intent.action.VIEW");
                                            intent.setDataAndType(uriX, qx1Var.n);
                                            intent.addFlags(1);
                                            context.startActivity(intent);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                ((ImageView) ov0Var.d).setOnClickListener(new View.OnClickListener() { // from class: gu7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object next;
                        byte b3 = b;
                        du7 du7Var2 = du7Var;
                        hu7 hu7Var2 = hu7Var;
                        switch (b3) {
                            case 0:
                                hu7Var2.c.m(du7Var2.k);
                                break;
                            default:
                                x77 x77Var = hu7Var2.c;
                                String str = du7Var2.k;
                                ((lv7) x77Var.d).invoke();
                                wjh wjhVar = (wjh) x77Var.c;
                                hd hdVar = (hd) wjhVar.e;
                                Context context = ((RecyclerView) wjhVar.b).getContext();
                                Iterator it = ((Iterable) ((qde) hdVar.g).g()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (Intrinsics.a(((jx1) next).getId(), str)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                jx1 jx1Var = (jx1) next;
                                if (jx1Var != null) {
                                    if (!(jx1Var instanceof vx1)) {
                                        if (!(jx1Var instanceof fz1)) {
                                            h9o.p();
                                            break;
                                        }
                                    } else {
                                        wxe wxeVar = ((vx1) jx1Var).b;
                                        if (wxeVar instanceof qx1) {
                                            qx1 qx1Var = (qx1) wxeVar;
                                            Uri uriX = w7d.x(qx1Var.m);
                                            Intent intent = new Intent("android.intent.action.VIEW");
                                            intent.setDataAndType(uriX, qx1Var.n);
                                            intent.addFlags(1);
                                            context.startActivity(intent);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
            default:
                final lu7 lu7Var = (lu7) obj;
                final ou7 ou7Var = (ou7) iVar;
                ou7Var.e = lu7Var;
                ou7Var.U();
                ov0 ov0Var2 = ou7Var.b;
                ((b98) ov0Var2.c).b.setOnClickListener(new View.OnClickListener() { // from class: nu7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object next;
                        byte b3 = b2;
                        lu7 lu7Var2 = lu7Var;
                        ou7 ou7Var2 = ou7Var;
                        switch (b3) {
                            case 0:
                                ou7Var2.c.L(lu7Var2.a);
                                break;
                            default:
                                ua7 ua7Var = ou7Var2.c;
                                String str = lu7Var2.a;
                                ((lv7) ua7Var.d).invoke();
                                i3j i3jVar = (i3j) ua7Var.c;
                                tah tahVar = (tah) i3jVar.c;
                                Context context = ((RecyclerView) i3jVar.a).getContext();
                                Iterator it = ((Iterable) ((pde) tahVar.h).g()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (Intrinsics.a(((b0a) next).getId(), str)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                b0a b0aVar = (b0a) next;
                                if (b0aVar != null && !(b0aVar instanceof zz9)) {
                                    if (!(b0aVar instanceof a0a)) {
                                        h9o.p();
                                        break;
                                    } else {
                                        a0a a0aVar = (a0a) b0aVar;
                                        Uri uriX = w7d.x(a0aVar.b);
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setDataAndType(uriX, a0aVar.d);
                                        intent.addFlags(1);
                                        context.startActivity(intent);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                ((ImageView) ov0Var2.d).setOnClickListener(new View.OnClickListener() { // from class: nu7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object next;
                        byte b3 = b;
                        lu7 lu7Var2 = lu7Var;
                        ou7 ou7Var2 = ou7Var;
                        switch (b3) {
                            case 0:
                                ou7Var2.c.L(lu7Var2.a);
                                break;
                            default:
                                ua7 ua7Var = ou7Var2.c;
                                String str = lu7Var2.a;
                                ((lv7) ua7Var.d).invoke();
                                i3j i3jVar = (i3j) ua7Var.c;
                                tah tahVar = (tah) i3jVar.c;
                                Context context = ((RecyclerView) i3jVar.a).getContext();
                                Iterator it = ((Iterable) ((pde) tahVar.h).g()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (Intrinsics.a(((b0a) next).getId(), str)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                b0a b0aVar = (b0a) next;
                                if (b0aVar != null && !(b0aVar instanceof zz9)) {
                                    if (!(b0aVar instanceof a0a)) {
                                        h9o.p();
                                        break;
                                    } else {
                                        a0a a0aVar = (a0a) b0aVar;
                                        Uri uriX = w7d.x(a0aVar.b);
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setDataAndType(uriX, a0aVar.d);
                                        intent.addFlags(1);
                                        context.startActivity(intent);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                fu7 fu7Var = (fu7) obj;
                ju7 ju7Var = (ju7) iVar;
                ju7Var.getClass();
                String strReplace = new Regex("\\s+").replace(StringsKt.l0(fu7Var.l).toString(), " ");
                ov0 ov0Var3 = ju7Var.b;
                ((OperaTextView) ov0Var3.d).setText(strReplace);
                ((b98) ov0Var3.c).b.setOnClickListener(new jf7(ju7Var, fu7Var, (byte) 4));
                break;
        }
    }

    public final void invoke(Object obj) {
        eig eigVar = (eig) obj;
        switch (this.a) {
            case 12:
                eigVar.F(zh8.h(1003, new e22("Player release timed out.")));
                break;
            default:
                eigVar.onRenderedFirstFrame();
                break;
        }
    }

    public final void o(Object obj, w69 w69Var) {
        ((eig) obj).c(new dig(w69Var));
    }

    public final Object r(x79 x79Var) {
        switch (this.a) {
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                m4c m4cVar = ExecutorsRegistrar.a;
                return xim.a;
        }
    }

    @Override // defpackage.h93
    public final void s() {
    }

    public final Object then(Task task) {
        int i;
        switch (this.a) {
            case 15:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }
}
