package defpackage;

import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.w;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class jd9 extends s63 {
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public x79 p;
    public lfh q;
    public final hd9 r = new hd9(this);

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        w parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.o.add(this.r);
    }

    @Override // defpackage.k24
    public final void onDetach() {
        w parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.o.remove(this.r);
        super.onDetach();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0195 A[PHI: r1
      0x0195: PHI (r1v5 int) = (r1v4 int), (r1v14 int) binds: [B:48:0x00e7, B:60:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.s63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dgh s0(android.view.LayoutInflater r24, android.view.ViewGroup r25, defpackage.epj r26) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd9.s0(android.view.LayoutInflater, android.view.ViewGroup, epj):dgh");
    }

    @Override // defpackage.s63
    public final void u0() {
        this.l = false;
        z0();
    }

    @Override // defpackage.s63
    public final void v0() {
        this.l = true;
        y0();
        if (!this.o) {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(getContext());
            if (iIsGooglePlayServicesAvailable == 0) {
                this.o = true;
            } else if (this.m) {
                googleApiAvailability.showErrorDialogFragment(getActivity(), iIsGooglePlayServicesAvailable, 0);
            }
        }
        z0();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, dx3] */
    public final void y0() {
        ?? r0 = (dx3) getActivity();
        if (fr3.Q((Context) r0, "android.permission.CAMERA")) {
            this.m = true;
        } else {
            this.m = false;
            f03.U(r0.j, "android.permission.CAMERA", new id9(this));
        }
    }

    public final void z0() {
        boolean z = this.l && this.m && !this.n && this.o;
        lfh lfhVar = this.q;
        if (!z) {
            if (lfhVar != null) {
                fe5 fe5Var = lfhVar.c;
                fe5Var.d = true;
                fe5Var.b();
                this.q = null;
                return;
            }
            return;
        }
        if (lfhVar == null) {
            ndc viewLifecycleOwner = getViewLifecycleOwner();
            ScheduledExecutorService scheduledExecutorService = vml.a;
            lfh lfhVar2 = new lfh(viewLifecycleOwner, (PreviewView) this.p.a, new be8((byte) 8));
            this.q = lfhVar2;
            lfhVar2.j.j(getViewLifecycleOwner(), new ks6(this, (byte) 14));
        }
    }
}
