package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ra4 extends CameraCaptureSession.CaptureCallback {
    public final String a;
    public final boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final List e;
    public final xm5 f;
    public final ArrayMap g;
    public final ArrayMap h;
    public final xfk i;
    public final sgk j;
    public final long k;
    public final cd5 l;
    public volatile Integer m;

    public ra4(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, xm5 xm5Var, ArrayMap arrayMap, ArrayMap arrayMap2, xfk xfkVar, sgk sgkVar) {
        this.a = str;
        this.b = z;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = list;
        this.f = xm5Var;
        this.g = arrayMap;
        this.h = arrayMap2;
        this.i = xfkVar;
        this.j = sgkVar;
        df2 df2Var = ta4.b;
        df2Var.getClass();
        this.k = df2.b.incrementAndGet(df2Var);
        this.l = new cd5();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        qp2.n("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        throw null;
    }

    public final int a() {
        int iIntValue;
        if (this.m != null) {
            Integer num = this.m;
            if (num != null) {
                return num.intValue();
            }
            n57.e("SequenceNumber has not been set for ", this, 33);
            return 0;
        }
        synchronized (this) {
            Integer num2 = this.m;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    public final void b(owh owhVar, long j, hwh hwhVar) {
        this.f.A(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ivh) list.get(i)).t(owhVar, j, hwhVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = owhVar.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ivh) owhVar.getRequest().d.get(i2)).t(owhVar, j, hwhVar);
        }
        Trace.endSection();
    }

    public final void c(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.f.A(this);
        Trace.endSection();
        owh owhVarI = i(captureRequest);
        w61 w61Var = new w61(totalCaptureResult, this.a);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((ivh) list.get(i)).s(owhVarI, j, w61Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = owhVarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ivh) owhVarI.getRequest().d.get(i2)).s(owhVarI, j, w61Var);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((ivh) list.get(i3)).D(owhVarI, j, w61Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = owhVarI.getRequest().d.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((ivh) owhVarI.getRequest().d.get(i4)).D(owhVarI, j, w61Var);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void d(CaptureRequest captureRequest, long j) {
        Trace.beginSection("onCaptureFailed");
        this.l.j0(Unit.a);
        owh owhVarI = i(captureRequest);
        b(owhVarI, j, new al8(owhVarI, j));
        Trace.endSection();
    }

    public final void e(CaptureRequest captureRequest, int i) {
        Trace.beginSection("onCaptureProcessProgressed");
        owh owhVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ivh) list.get(i2)).l(owhVarI, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = owhVarI.getRequest().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ivh) owhVarI.getRequest().d.get(i3)).l(owhVarI, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void f(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.l.j0(Unit.a);
        this.f.A(this);
        if (a() != i) {
            StringBuilder sb = new StringBuilder("onCaptureSequenceAborted was invoked on ");
            sb.append(a());
            sb.append(", but expected ");
            sb.append(i);
            sb.append('!');
            this.j.getClass();
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            owh owhVar = (owh) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((ivh) list.get(i3)).q(owhVar);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            owh owhVar2 = (owh) arrayList.get(i4);
            int size4 = owhVar2.getRequest().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((ivh) owhVar2.getRequest().d.get(i5)).q(owhVar2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void g(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.l.j0(Unit.a);
        this.f.A(this);
        if (a() != i) {
            StringBuilder sb = new StringBuilder("onCaptureSequenceCompleted was invoked on ");
            sb.append(a());
            sb.append(", but expected ");
            sb.append(i);
            sb.append('!');
            this.j.getClass();
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            owh owhVar = (owh) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((ivh) list.get(i3)).p(owhVar, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            owh owhVar2 = (owh) arrayList.get(i4);
            int size4 = owhVar2.getRequest().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((ivh) owhVar2.getRequest().d.get(i5)).p(owhVar2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void h(CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onCaptureStarted");
        this.l.j0(Unit.a);
        owh owhVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ivh) list.get(i)).r(owhVarI, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = owhVarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ivh) owhVarI.getRequest().d.get(i2)).r(owhVarI, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final owh i(CaptureRequest captureRequest) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (owh) this.d.get(i);
            }
        }
        kp5.d("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        wfk wfkVar;
        Object obj;
        Trace.beginSection("onCaptureBufferLost");
        yfk yfkVar = (yfk) this.g.get(surface);
        ArrayMap arrayMap = this.h;
        if (yfkVar == null) {
            fuf fufVar = (fuf) arrayMap.get(surface);
            yfk yfkVar2 = null;
            if (fufVar != null) {
                int i = fufVar.a;
                ArrayList arrayList = this.i.h;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i2);
                    i2++;
                    if (((wfk) obj).a == i) {
                        break;
                    }
                }
                wfkVar = (wfk) obj;
            } else {
                wfkVar = null;
            }
            if (wfkVar != null) {
                cg4 cg4Var = wfkVar.j;
                if (cg4Var == null) {
                    cg4Var = null;
                }
                if (cg4Var != null) {
                    yfkVar2 = new yfk(cg4Var.a);
                }
            }
            yfkVar = yfkVar2;
        }
        fuf fufVar2 = (fuf) arrayMap.get(surface);
        if (yfkVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find the streamId for ");
            sb.append(surface);
            t14.h(sb, " on ", ho9.a(j));
            return;
        }
        if (fufVar2 == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find the outputId for ");
            sb2.append(surface);
            t14.h(sb2, " on ", ho9.a(j));
            return;
        }
        owh owhVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        List list2 = list;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ivh) list.get(i3)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = owhVarI.getRequest().d.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((ivh) owhVarI.getRequest().d.get(i4)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((ivh) list.get(i5)).h(owhVarI, j, yfkVar.a, fufVar2.a);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size5 = owhVarI.getRequest().d.size();
        for (int i6 = 0; i6 < size5; i6++) {
            ((ivh) owhVarI.getRequest().d.get(i6)).h(owhVarI, j, yfkVar.a, fufVar2.a);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        c(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Trace.beginSection("onCaptureFailed");
        this.l.j0(Unit.a);
        b(i(captureRequest), captureFailure.getFrameNumber(), new c31(captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        x61 x61Var = new x61(captureResult, this.a);
        owh owhVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ivh) list.get(i)).n(owhVarI, frameNumber, x61Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = owhVarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ivh) owhVarI.getRequest().d.get(i2)).n(owhVarI, frameNumber, x61Var);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        f(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        g(i, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        h(captureRequest, j2, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(@NotNull CameraCaptureSession cameraCaptureSession, @NotNull CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onReadoutStarted");
        owh owhVarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ivh) list.get(i)).k(owhVarI, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = owhVarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ivh) owhVarI.getRequest().d.get(i2)).k(owhVarI, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.k;
    }
}
