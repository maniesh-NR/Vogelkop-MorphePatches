package defpackage;

import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;

/* loaded from: classes.dex */
public final class nhb implements esk {

    @NonNull
    @WeakOwner
    private final dy a;
    public hl b;

    public nhb(vzk vzkVar) {
        rx rxVar = new rx(this, (byte) 4);
        this.a = rxVar;
        this.b = ((cy) vzkVar.a).c().f;
        vzkVar.h(rxVar);
    }

    public final Object get() {
        return this.b;
    }
}
