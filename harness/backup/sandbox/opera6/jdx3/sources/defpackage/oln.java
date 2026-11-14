package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class oln implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qln b;

    public /* synthetic */ oln(qln qlnVar, byte b) {
        this.a = b;
        this.b = qlnVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        qln qlnVar = this.b;
        switch (b) {
            case 0:
                aln alnVar = (aln) obj;
                if (alnVar != null) {
                    Context context = qlnVar.a;
                    rgh rghVar = qlnVar.m;
                    String str = alnVar.c(context, new o2c(false, (((Resources) rghVar.b).getDisplayMetrics().widthPixels * 90) / 100, ((((Resources) rghVar.b).getDisplayMetrics().heightPixels - ((Context) rghVar.a).getResources().getDimensionPixelSize(2131165344)) * 90) / 100, false)).c;
                    if (str != null) {
                        agm agmVar = qlnVar.g;
                        umi umiVar = qlnVar.b;
                        agmVar.getClass();
                        String[] strArr = wqm.a;
                        if (N.Mhbidx2d(str) == 3) {
                            umiVar.g(new jp5(agmVar, str, (byte) 10)).a(null);
                            break;
                        }
                    }
                }
                break;
            default:
                qlnVar.r();
                break;
        }
    }
}
