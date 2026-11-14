package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.StylingTextView;
import java.util.ArrayList;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public final class wm3 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public wm3(View view, boolean z, StylingTextView stylingTextView, ViewGroup viewGroup) {
        this.c = view;
        this.b = z;
        this.d = stylingTextView;
        this.e = viewGroup;
    }

    public wm3(gn3 gn3Var, ArrayList arrayList, String str, boolean z) {
        this.c = arrayList;
        this.d = str;
        this.b = z;
        this.e = gn3Var;
    }

    public wm3(p03 p03Var, boolean z, ll4 ll4Var, vr9 vr9Var) {
        this.b = z;
        this.c = ll4Var;
        this.d = vr9Var;
        this.e = p03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((gn3) obj).j((ArrayList) obj3, (String) obj2, z);
                break;
            case 1:
                p03 p03Var = (p03) obj;
                if (!p03Var.b) {
                    if (!z) {
                        p03Var.c.getClass();
                        ujp ujpVarL = ujp.l();
                        int iN = ujp.n(p03Var.a);
                        ujpVarL.getClass();
                        ujp.h(iN, "Android.BackgroundTaskScheduler.TaskLoadedNative");
                    }
                    ix5 ix5Var = p03Var.c;
                    ll4 ll4Var = (ll4) obj3;
                    vr9 vr9Var = (vr9) obj2;
                    ix5Var.getClass();
                    Context context = t8.a;
                    String[] strArr = OperaApplication.K;
                    CommandLine commandLine = ((OperaApplication) context.getApplicationContext()).n;
                    if (commandLine == null) {
                        commandLine = null;
                    }
                    fsp.g(context, commandLine);
                    e7d.a(context, new djf(ix5Var, ll4Var, vr9Var));
                    break;
                }
                break;
            default:
                View view = (View) obj3;
                float f = 180.0f * view.getContext().getResources().getDisplayMetrics().density;
                int i = 8;
                if (view.getWidth() >= f && view.getHeight() >= f && (!z || ((StylingTextView) obj2).getBottom() <= ((ViewGroup) obj).getHeight())) {
                    i = 0;
                }
                view.setVisibility(i);
                break;
        }
    }
}
