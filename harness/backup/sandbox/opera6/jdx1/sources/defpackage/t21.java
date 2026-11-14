package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public class t21 implements ac4 {
    public final v21 a;
    public final CameraCaptureSession b;
    public final db4 c;
    public final Handler d;

    public t21(v21 v21Var, CameraCaptureSession cameraCaptureSession, db4 db4Var, Handler handler) {
        this.a = v21Var;
        this.b = cameraCaptureSession;
        this.c = db4Var;
        this.d = handler;
        bf2 bf2Var = de4.a;
        bf2Var.getClass();
        bf2.b.incrementAndGet(bf2Var);
    }

    @Override // defpackage.inm
    public Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(CameraCaptureSession.class))) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.ac4
    public final Integer M0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        v21 v21Var = this.a;
        sb.append(v21Var.c);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String str = v21Var.c;
            db4 db4Var = this.c;
            try {
                numValueOf = Integer.valueOf(this.b.capture(captureRequest, captureCallback, this.d));
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    db4Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                numValueOf = null;
            }
            return numValueOf;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }

    @Override // defpackage.ac4
    public final boolean O() {
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        v21 v21Var = this.a;
        sb.append(v21Var.c);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String str = v21Var.c;
            db4 db4Var = this.c;
            try {
                this.b.abortCaptures();
                unit = Unit.a;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    int i = 3;
                    if (reason != 1) {
                        if (reason == 2) {
                            i = 6;
                        } else if (reason == 3) {
                            i = 0;
                        } else if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    db4Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                unit = null;
            }
            return unit != null;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }

    @Override // defpackage.ac4
    public final wc4 U() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.ac4
    public final boolean g0(List list) {
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#finalizeOutputConfigurations-");
        v21 v21Var = this.a;
        sb.append(v21Var.c);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String str = v21Var.c;
            db4 db4Var = this.c;
            try {
                CameraCaptureSession cameraCaptureSession = this.b;
                List list2 = list;
                ArrayList arrayList = new ArrayList(k95.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((OutputConfiguration) ((h81) it.next()).E(uqh.a(OutputConfiguration.class)));
                }
                cameraCaptureSession.finalizeOutputConfigurations(arrayList);
                unit = Unit.a;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    int i = 3;
                    if (reason != 1) {
                        if (reason == 2) {
                            i = 6;
                        } else if (reason == 3) {
                            i = 0;
                        } else if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    db4Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                unit = null;
            }
            return unit != null;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }

    @Override // defpackage.ac4
    public final Surface getInputSurface() {
        return this.b.getInputSurface();
    }

    @Override // defpackage.ac4
    public final boolean l1() {
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        v21 v21Var = this.a;
        sb.append(v21Var.c);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String str = v21Var.c;
            db4 db4Var = this.c;
            try {
                this.b.stopRepeating();
                unit = Unit.a;
            } catch (Exception e) {
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    int i = 3;
                    if (reason != 1) {
                        if (reason == 2) {
                            i = 6;
                        } else if (reason == 3) {
                            i = 0;
                        } else if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    db4Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                unit = null;
            }
            return unit != null;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }

    @Override // defpackage.ac4
    public final Integer s0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        v21 v21Var = this.a;
        sb.append(v21Var.c);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String str = v21Var.c;
            db4 db4Var = this.c;
            try {
                numValueOf = Integer.valueOf(this.b.setRepeatingRequest(captureRequest, captureCallback, this.d));
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    db4Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                numValueOf = null;
            }
            return numValueOf;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }

    @Override // defpackage.ac4
    public final Integer t0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        v21 v21Var = this.a;
        sb.append(v21Var.c);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String str = v21Var.c;
            db4 db4Var = this.c;
            try {
                numValueOf = Integer.valueOf(this.b.captureBurst(arrayList, captureCallback, this.d));
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    db4Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                numValueOf = null;
            }
            return numValueOf;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }

    @Override // defpackage.ac4
    public final Integer u1(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        v21 v21Var = this.a;
        sb.append(v21Var.c);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String str = v21Var.c;
            db4 db4Var = this.c;
            try {
                numValueOf = Integer.valueOf(this.b.setRepeatingBurst(arrayList, captureCallback, this.d));
            } catch (Exception e) {
                int i = 0;
                if (e instanceof CameraAccessException) {
                    e.getMessage();
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason == 1) {
                        i = 3;
                    } else if (reason == 2) {
                        i = 6;
                    } else if (reason != 3) {
                        if (reason == 4) {
                            i = 1;
                        } else if (reason != 5) {
                            cameraAccessException.toString();
                            i = 11;
                        } else {
                            i = 2;
                        }
                    }
                    db4Var.a(i, str, true);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    e.getMessage();
                    db4Var.a(9, str, false);
                } else if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                numValueOf = null;
            }
            return numValueOf;
        } finally {
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(vep.o(jElapsedRealtimeNanos) / 1000000.0d)}, 1));
        }
    }
}
