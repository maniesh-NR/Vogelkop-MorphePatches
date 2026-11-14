package defpackage;

import com.opera.android.widget.LottieAnimationView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class m2d implements j3d {
    public final /* synthetic */ byte a;
    public final WeakReference b;

    public m2d(LottieAnimationView lottieAnimationView, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // defpackage.j3d
    public final void onResult(Object obj) {
        byte b = this.a;
        WeakReference weakReference = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                n2d n2dVar = (n2d) weakReference.get();
                if (n2dVar != null) {
                    int i = n2dVar.c;
                    if (i != 0) {
                        n2dVar.setImageResource(i);
                    }
                    n2d.n.onResult(th);
                    break;
                }
                break;
            default:
                p2d p2dVar = (p2d) obj;
                n2d n2dVar2 = (n2d) weakReference.get();
                if (n2dVar2 != null) {
                    n2dVar2.m(p2dVar);
                    break;
                }
                break;
        }
    }
}
