package defpackage;

import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import com.opera.android.RootView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class x7i implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RootView b;

    public /* synthetic */ x7i(RootView rootView, byte b) {
        this.a = b;
        this.b = rootView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mcj mcjVar;
        byte b = this.a;
        boolean z = false;
        RootView rootView = this.b;
        switch (b) {
            case 0:
                rootView.h = false;
                vml.a(rootView.i);
                break;
            case 1:
                int i = RootView.D;
                rootView.e();
                rootView.invalidate();
                break;
            case 2:
                qwe qweVar = rootView.j;
                int i2 = RootView.D;
                c1f c1fVar = rootView.x;
                rootView.A = false;
                if (rootView.isAttachedToWindow() && (mcjVar = rootView.z) != null) {
                    int i3 = Build.VERSION.SDK_INT;
                    Window window = (Window) mcjVar.b;
                    if (i3 < 30) {
                        ocp.p(window, rootView.m);
                    } else {
                        window.getAttributes().layoutInDisplayCutoutMode = 3;
                    }
                    c1fVar.h();
                    ArrayList arrayList = (ArrayList) c1fVar.a;
                    int size = arrayList.size();
                    int iX = -16777216;
                    int i4 = 0;
                    int iR = -16777216;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        iR = p37.r(iR, ((gck) obj).a.b());
                    }
                    int iX2 = p37.X(iR, qweVar.a.a);
                    if (rootView.p != 0) {
                        int iR2 = rootView.s;
                        c1fVar.h();
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList.get(i5);
                            i5++;
                            iR2 = p37.r(iR2, ((gck) obj2).a.a());
                        }
                        iX = p37.X(iR2, qweVar.a.a);
                    }
                    rootView.z.t(p37.u0(iX2));
                    rootView.z.r(p37.u0(iX));
                    if (rootView.o != 0) {
                        iX2 = 0;
                    }
                    mcj mcjVar2 = rootView.z;
                    Window window2 = (Window) mcjVar2.b;
                    if (iX2 != window2.getStatusBarColor()) {
                        window2.setStatusBarColor(iX2);
                        mcjVar2.j();
                    }
                    mcj mcjVar3 = rootView.z;
                    Window window3 = (Window) mcjVar3.b;
                    if (window3.getNavigationBarColor() != 0) {
                        window3.setNavigationBarColor(0);
                        mcjVar3.j();
                    }
                    mcj mcjVar4 = rootView.z;
                    Window window4 = (Window) mcjVar4.b;
                    WindowManager.LayoutParams attributes = window4.getAttributes();
                    boolean z2 = true;
                    if ((attributes.flags & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                        window4.addFlags(Integer.MIN_VALUE);
                        z = true;
                    }
                    if ((attributes.flags & 201326592) != 0) {
                        window4.clearFlags(201326592);
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        mcjVar4.j();
                        WeakHashMap weakHashMap = r5n.a;
                        rootView.requestApplyInsets();
                        break;
                    }
                }
                break;
            case 3:
                int i6 = RootView.D;
                rootView.f();
                break;
            default:
                rootView.requestLayout();
                break;
        }
    }
}
