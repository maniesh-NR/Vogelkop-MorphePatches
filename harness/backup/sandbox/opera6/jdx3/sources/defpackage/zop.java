package defpackage;

/* loaded from: classes.dex */
public final class zop implements cpp {
    public static final Object c = new Object();
    public volatile cpp a;
    public volatile Object b;

    public static cpp a(cpp cppVar) {
        if (cppVar instanceof zop) {
            return cppVar;
        }
        zop zopVar = new zop();
        zopVar.b = c;
        zopVar.a = cppVar;
        return zopVar;
    }

    @Override // defpackage.cpp, defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        Object objMo1zza;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objMo1zza = this.b;
            if (objMo1zza == obj2) {
                objMo1zza = this.a.mo1zza();
                Object obj3 = this.b;
                if (obj3 != obj2 && obj3 != objMo1zza) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo1zza + ". This is likely due to a circular dependency.");
                }
                this.b = objMo1zza;
                this.a = null;
            }
        }
        return objMo1zza;
    }
}
