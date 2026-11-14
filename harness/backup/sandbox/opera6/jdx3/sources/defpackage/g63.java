package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class g63 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g63(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((dw7) obj).c = i;
                break;
            case 1:
                ky7 ky7Var = (ky7) obj;
                ((ry7) ky7Var.d).invoke(Integer.valueOf(i));
                int i2 = ky7Var.b;
                if (i != i2) {
                    ky7Var.notifyItemChanged(i2);
                    ky7Var.notifyItemChanged(i);
                    ky7Var.b = i;
                    break;
                }
                break;
            case 2:
                zzb zzbVar = (zzb) obj;
                if (i == zzbVar.d) {
                    zzbVar.G();
                    break;
                }
                break;
            case 3:
                ky7 ky7Var2 = (ky7) obj;
                uig uigVar = (uig) ky7Var2.e;
                if (i != ky7Var2.b) {
                    float f = ((float[]) ky7Var2.d)[i];
                    gig gigVar = uigVar.o0;
                    if (gigVar != null && gigVar.C(13)) {
                        gig gigVar2 = uigVar.o0;
                        gigVar2.c(new thg(f, gigVar2.getPlaybackParameters().b));
                    }
                }
                uigVar.q.dismiss();
                break;
            default:
                f7d f7dVar = ((wrl) ((tg7) obj).e).b.a;
                if (i == 0) {
                    f7dVar.b.e(new vfn(), false);
                    break;
                } else if (i == 1) {
                    f7dVar.a(tc6.class);
                    break;
                } else if (i == 2) {
                    f7dVar.getClass();
                    f7dVar.b.e(new qk(), false);
                    break;
                } else if (i == 3) {
                    f7dVar.getClass();
                    f7dVar.b.e(new exe(), false);
                    break;
                }
                break;
        }
    }
}
