package defpackage;

import com.opera.android.Lazy;

/* loaded from: classes.dex */
public final class j4c extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ esk f;

    public /* synthetic */ j4c(esk eskVar, byte b) {
        this.e = b;
        this.f = eskVar;
    }

    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        esk eskVar = this.f;
        switch (b) {
        }
        return eskVar.get();
    }
}
