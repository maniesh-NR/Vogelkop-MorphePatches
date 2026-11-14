package defpackage;

/* loaded from: classes.dex */
public abstract class dy8 {
    public final String a;
    public final long b;

    public dy8(String str) {
        this.a = str;
        this.b = System.currentTimeMillis();
    }

    public dy8(orb orbVar, String str) {
        this.a = str;
        this.b = orbVar.a.getLong("ts") * 1000;
    }

    public void a(orb orbVar) {
        orbVar.p(this.a, "event_type");
        orbVar.o(this.b / 1000, "ts");
    }
}
