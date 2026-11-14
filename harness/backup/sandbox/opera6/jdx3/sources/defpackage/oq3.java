package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class oq3 {
    public final /* synthetic */ byte a;
    public byte b;
    public boolean c;
    public final Runnable d;
    public final /* synthetic */ nv5 e;

    public oq3(BottomSheetBehavior bottomSheetBehavior) {
        this.a = (byte) 0;
        this.e = bottomSheetBehavior;
        this.d = new ig(this, (byte) 13);
    }

    public oq3(SideSheetBehavior sideSheetBehavior) {
        this.a = (byte) 1;
        this.e = sideSheetBehavior;
        this.d = new mni(this, (byte) 13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        byte b = this.a;
        Runnable runnable = this.d;
        SideSheetBehavior sideSheetBehavior = this.e;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) sideSheetBehavior;
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((ig) runnable);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior;
                WeakReference weakReference2 = sideSheetBehavior2.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior2.p.get()).postOnAnimation((mni) runnable);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }
}
