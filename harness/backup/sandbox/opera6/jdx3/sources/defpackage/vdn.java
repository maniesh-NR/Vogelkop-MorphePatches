package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vdn {
    public final boolean a;
    public final efn b;
    public final hfn c;
    public final esk d;

    public vdn(Context context, efn efnVar) {
        SharedPreferences sharedPreferences = ru9.c(context).a;
        this.a = sharedPreferences.getBoolean("vpn.enabled", false);
        if (sharedPreferences.contains("vpn.enable_only_in_incognito")) {
            final boolean z = sharedPreferences.getBoolean("vpn.enable_only_in_incognito", false);
            final byte b = 1;
            this.d = new esk() { // from class: udn
                public final Object get() {
                    byte b2 = b;
                    boolean z2 = z;
                    switch (b2) {
                    }
                    return Boolean.valueOf(z2);
                }
            };
        } else {
            this.d = new k32(this, context, (byte) 11);
        }
        this.b = efnVar;
        this.c = null;
    }

    public vdn(boolean z, final boolean z2, efn efnVar, hfn hfnVar) {
        this.a = z;
        final byte b = 0;
        this.d = new esk() { // from class: udn
            public final Object get() {
                byte b2 = b;
                boolean z22 = z2;
                switch (b2) {
                }
                return Boolean.valueOf(z22);
            }
        };
        this.b = efnVar;
        this.c = hfnVar;
    }

    public final boolean a() {
        return this.a && !((Boolean) this.d.get()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.d.get()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vdn.class == obj.getClass()) {
            vdn vdnVar = (vdn) obj;
            if (this.a == vdnVar.a && ((Boolean) this.d.get()).booleanValue() == ((Boolean) vdnVar.d.get()).booleanValue() && Objects.equals(this.b, vdnVar.b) && Objects.equals(this.c, vdnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.d.get(), this.b, this.c);
    }
}
