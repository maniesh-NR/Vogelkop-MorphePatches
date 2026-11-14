package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class yte implements Callback {
    public final /* synthetic */ vzk a;
    public final /* synthetic */ g77 b;
    public final /* synthetic */ bue c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ l0c e;

    public /* synthetic */ yte(vzk vzkVar, g77 g77Var, bue bueVar, boolean z, l0c l0cVar) {
        this.a = vzkVar;
        this.b = g77Var;
        this.c = bueVar;
        this.d = z;
        this.e = l0cVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        new mp4(((fqe) ((wv1) this.a.a).get()).a, new ga6(this.b, (byte) 5), (d93) obj).Q(new hg7(this.c, this.d, this.e));
    }
}
