package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class fh2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pad b;

    public /* synthetic */ fh2(pad padVar, int i, long j, long j2) {
        this.a = (byte) 1;
        this.b = padVar;
    }

    public /* synthetic */ fh2(pad padVar, long j) {
        this.a = (byte) 2;
        this.b = padVar;
    }

    public /* synthetic */ fh2(pad padVar, Object obj, byte b) {
        this.a = b;
        this.b = padVar;
    }

    public /* synthetic */ fh2(pad padVar, String str, long j, long j2) {
        this.a = (byte) 4;
        this.b = padVar;
    }

    public /* synthetic */ fh2(pad padVar, oj9 oj9Var, sj6 sj6Var) {
        this.a = (byte) 9;
        this.b = padVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pad padVar = this.b;
        switch (b) {
            case 0:
                mi8 mi8Var = (mi8) padVar.c;
                String str = tym.a;
                el6 el6Var = mi8Var.a.t;
                el6Var.V(el6Var.U(), 1029, new zk6((byte) 10));
                break;
            case 1:
                mi8 mi8Var2 = (mi8) padVar.c;
                String str2 = tym.a;
                el6 el6Var2 = mi8Var2.a.t;
                el6Var2.V(el6Var2.U(), 1011, new cl6((byte) 11));
                break;
            case 2:
                mi8 mi8Var3 = (mi8) padVar.c;
                String str3 = tym.a;
                el6 el6Var3 = mi8Var3.a.t;
                el6Var3.V(el6Var3.U(), 1010, new cl6((byte) 13));
                break;
            case 3:
                mi8 mi8Var4 = (mi8) padVar.c;
                String str4 = tym.a;
                el6 el6Var4 = mi8Var4.a.t;
                el6Var4.V(el6Var4.U(), 1032, new cl6((byte) 21));
                break;
            case 4:
                mi8 mi8Var5 = (mi8) padVar.c;
                String str5 = tym.a;
                el6 el6Var5 = mi8Var5.a.t;
                el6Var5.V(el6Var5.U(), 1008, new kp5((byte) 28));
                break;
            case 5:
                mi8 mi8Var6 = (mi8) padVar.c;
                String str6 = tym.a;
                el6 el6Var6 = mi8Var6.a.t;
                el6Var6.V(el6Var6.U(), 1012, new cl6((byte) 9));
                break;
            case 6:
                mi8 mi8Var7 = (mi8) padVar.c;
                String str7 = tym.a;
                el6 el6Var7 = mi8Var7.a.t;
                el6Var7.V(el6Var7.U(), 1007, new zk6((byte) 17));
                break;
            case 7:
                mi8 mi8Var8 = (mi8) padVar.c;
                String str8 = tym.a;
                el6 el6Var8 = mi8Var8.a.t;
                el6Var8.V(el6Var8.U(), 1031, new zk6((byte) 29));
                break;
            case 8:
                mi8 mi8Var9 = (mi8) padVar.c;
                String str9 = tym.a;
                el6 el6Var9 = mi8Var9.a.t;
                el6Var9.V(el6Var9.U(), 1014, new cl6((byte) 6));
                break;
            default:
                mi8 mi8Var10 = (mi8) padVar.c;
                String str10 = tym.a;
                el6 el6Var10 = mi8Var10.a.t;
                el6Var10.V(el6Var10.U(), 1009, new cl6((byte) 2));
                break;
        }
    }
}
