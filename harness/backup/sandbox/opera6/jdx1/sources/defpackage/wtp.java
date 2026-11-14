package defpackage;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class wtp {
    public final /* synthetic */ byte a;
    public final AbstractSafeParcelable b;

    public /* synthetic */ wtp(AbstractSafeParcelable abstractSafeParcelable, byte b) {
        this.a = b;
        this.b = abstractSafeParcelable;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return this.b.zza();
            default:
                return this.b.zza;
        }
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return this.b.zzm();
            default:
                return this.b.zzb;
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return this.b.zzb();
            default:
                return this.b.zzd;
        }
    }
}
