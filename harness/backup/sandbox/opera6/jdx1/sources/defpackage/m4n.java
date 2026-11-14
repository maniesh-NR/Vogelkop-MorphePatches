package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class m4n implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iuh b;

    public /* synthetic */ m4n(iuh iuhVar, int i, long j) {
        this.a = (byte) 3;
        this.b = iuhVar;
    }

    public /* synthetic */ m4n(iuh iuhVar, long j, int i) {
        this.a = (byte) 4;
        this.b = iuhVar;
    }

    public /* synthetic */ m4n(iuh iuhVar, Object obj, byte b) {
        this.a = b;
        this.b = iuhVar;
    }

    public /* synthetic */ m4n(iuh iuhVar, String str, long j, long j2) {
        this.a = (byte) 0;
        this.b = iuhVar;
    }

    public /* synthetic */ m4n(iuh iuhVar, oj9 oj9Var, sj6 sj6Var) {
        this.a = (byte) 6;
        this.b = iuhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        iuh iuhVar = this.b;
        switch (b) {
            case 0:
                mi8 mi8Var = (mi8) iuhVar.c;
                String str = tym.a;
                el6 el6Var = mi8Var.a.t;
                el6Var.V(el6Var.U(), 1016, new zk6((byte) 11));
                break;
            case 1:
                mi8 mi8Var2 = (mi8) iuhVar.c;
                String str2 = tym.a;
                el6 el6Var2 = mi8Var2.a.t;
                el6Var2.V(el6Var2.U(), 1030, new cl6((byte) 24));
                break;
            case 2:
                mi8 mi8Var3 = (mi8) iuhVar.c;
                String str3 = tym.a;
                el6 el6Var3 = mi8Var3.a.t;
                el6Var3.V(el6Var3.U(), 1019, new zk6((byte) 0));
                break;
            case 3:
                mi8 mi8Var4 = (mi8) iuhVar.c;
                String str4 = tym.a;
                el6 el6Var4 = mi8Var4.a.t;
                el6Var4.V(el6Var4.R((jrd) el6Var4.d.f), 1018, new zk6((byte) 18));
                break;
            case 4:
                mi8 mi8Var5 = (mi8) iuhVar.c;
                String str5 = tym.a;
                el6 el6Var5 = mi8Var5.a.t;
                el6Var5.V(el6Var5.R((jrd) el6Var5.d.f), 1021, new zk6((byte) 21));
                break;
            case 5:
                mi8 mi8Var6 = (mi8) iuhVar.c;
                String str6 = tym.a;
                el6 el6Var6 = mi8Var6.a.t;
                el6Var6.V(el6Var6.U(), 1015, new cl6((byte) 3));
                break;
            default:
                mi8 mi8Var7 = (mi8) iuhVar.c;
                String str7 = tym.a;
                el6 el6Var7 = mi8Var7.a.t;
                el6Var7.V(el6Var7.U(), 1017, new zk6((byte) 28));
                break;
        }
    }
}
