package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.LayerDrawable;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class lt2 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lt2(int i, eme emeVar, ot2 ot2Var) {
        this.a = (byte) 0;
        this.b = i;
        this.c = emeVar;
        this.d = ot2Var;
    }

    public /* synthetic */ lt2(etc etcVar, rc5 rc5Var, Context context, int i) {
        this.a = (byte) 1;
        this.c = etcVar;
        this.d = context;
        this.b = i;
    }

    public /* synthetic */ lt2(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ lt2(rg rgVar, Context context, int i) {
        this.a = (byte) 2;
        this.c = rgVar;
        this.d = context;
        this.b = i;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) throws cam {
        switch (this.a) {
            case 0:
                int i = this.b;
                eme emeVar = (eme) this.c;
                ot2 ot2Var = (ot2) this.d;
                a4g a4gVar = (a4g) obj;
                w3g w3gVarB = a4gVar.b(i);
                if (w3gVarB != null) {
                    ot2Var.j.get();
                    zhj.a(new q4g(a4gVar, w3gVarB, false, 2132020987, emeVar, 2132020312, 2132018535, (yu2) ot2Var.i.get(), ((x5g) ot2Var.d.get()).d, ((qim) ot2Var.c.get()).c), 4099).c(ot2Var.a);
                    return;
                }
                return;
            case 1:
                etc etcVar = (etc) this.c;
                Context context = (Context) this.d;
                int i2 = this.b;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    etcVar.setDrawable(0, rc5.Z(new hq4(bitmap, -1), context, i2));
                    etcVar.invalidateSelf();
                    etcVar.a.K();
                    return;
                }
                return;
            case 2:
                ((rg) this.c).invoke(eti.b((Context) this.d, (Bitmap) obj, this.b));
                return;
            case 3:
                zzb zzbVar = (zzb) this.c;
                int i3 = this.b;
                tzb tzbVar = (tzb) this.d;
                String str = (String) obj;
                if (zzbVar.d == i3) {
                    zzbVar.H();
                    Locale locale = Locale.ROOT;
                    ks3.B("Failed to install language", "language: " + tzbVar.a + ", reason: " + str);
                    zzbVar.I();
                    return;
                }
                return;
            case 4:
                Context context2 = (Context) this.c;
                int i4 = this.b;
                LayerDrawable layerDrawable = (LayerDrawable) this.d;
                layerDrawable.setDrawable(0, eti.b(context2, (Bitmap) obj, i4));
                layerDrawable.invalidateSelf();
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                int i5 = this.b;
                vr9 vr9Var = (vr9) this.d;
                kln klnVar = (kln) obj;
                synchronized (arrayList) {
                    arrayList.set(i5, klnVar);
                    vr9Var.run();
                }
                return;
            default:
                ami amiVar = (ami) this.c;
                int i6 = this.b;
                Callback callback = (Callback) this.d;
                aln alnVar = (aln) obj;
                amiVar.getClass();
                if (alnVar != null && (i6 & 1) != 0) {
                    amiVar.D(alnVar);
                }
                callback.run(alnVar);
                return;
        }
    }
}
