package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import com.opera.android.media.WebPictureInPictureActivity;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cyd {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public cyd(Typeface typeface, wxd wxdVar) {
        int i;
        int i2;
        int i3;
        wjh wjhVar;
        int i4 = 0;
        this.a = (byte) 0;
        this.f = new Object();
        this.e = typeface;
        this.c = wxdVar;
        int iA = wxdVar.a(6);
        if (iA != 0) {
            int i5 = iA + ((t9d) wxdVar).a;
            i = ((ByteBuffer) ((t9d) wxdVar).d).getInt(((ByteBuffer) ((t9d) wxdVar).d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.d = new char[i << 1];
        this.g = new long[0];
        this.h = new kam[0];
        this.b = 0;
        this.i = new int[0];
        this.j = new int[0];
        this.k = new int[0];
        this.l = new int[0];
        int iA2 = wxdVar.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + ((t9d) wxdVar).a;
            i2 = ((ByteBuffer) ((t9d) wxdVar).d).getInt(((ByteBuffer) ((t9d) wxdVar).d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.h = new kam[i2];
        this.b = i2;
        vxd vxdVar = new vxd();
        for (int i7 = 0; i7 < i2; i7++) {
            wxdVar.d(vxdVar, i7);
            int iA3 = vxdVar.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) ((t9d) vxdVar).d).getInt(iA3 + ((t9d) vxdVar).a) : 0, (char[]) this.d, i7 << 1);
        }
        if (i2 > 0) {
            wxd wxdVar2 = (wxd) this.c;
            kam[] kamVarArr = (kam[]) this.h;
            int i8 = this.b;
            ac1 ac1Var = new ac1();
            ac1Var.c = wxdVar2;
            ac1Var.d = kamVarArr;
            ac1Var.a = i8;
            int[] iArr = new int[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                iArr[i9] = i9;
            }
            vxd vxdVar2 = new vxd();
            uup.C(iArr, (wxd) ac1Var.c, (kam[]) ac1Var.d, new vxd(), new vxd(), 0, i8 - 1);
            int iD = 0;
            int i10 = 0;
            int i11 = 0;
            while (i11 < i8) {
                int iE = ac1Var.e(iArr[i11], 0, vxdVar2);
                i10++;
                int i12 = i11;
                while (i12 < i8 && ac1Var.e(iArr[i12], 0, vxdVar2) == iE) {
                    i12++;
                }
                int i13 = i12;
                vxd vxdVar3 = vxdVar2;
                iD += ac1Var.d(iArr, i11, i13, 1, vxdVar3);
                i11 = i13;
                vxdVar2 = vxdVar3;
            }
            vxd vxdVar4 = vxdVar2;
            ac1Var.e = new long[iD];
            ac1Var.b = 0;
            if (i8 == 0) {
                wjhVar = new wjh(new long[0], new int[0], new int[0], new int[0], new int[0], (byte) 29);
            } else {
                int[] iArr2 = new int[i10];
                int[] iArr3 = new int[i10];
                p79 p79Var = new p79();
                p79Var.a = new int[1024];
                int i14 = 0;
                int i15 = 0;
                while (i14 < i8) {
                    int iE2 = ac1Var.e(iArr[i14], 0, vxdVar4);
                    iArr2[i15] = iE2;
                    int i16 = i14;
                    while (i16 < i8 && ac1Var.e(iArr[i16], 0, vxdVar4) == iE2) {
                        i16++;
                    }
                    int i17 = i16;
                    iArr3[i15] = ac1Var.h(iArr, i14, i17, 1, 0, vxdVar4, p79Var);
                    i15++;
                    i14 = i17;
                }
                int i18 = 0;
                int iMax = 0;
                while (true) {
                    i3 = 127744;
                    if (i18 >= i10) {
                        break;
                    }
                    int i19 = iArr2[i18];
                    if (i19 >= 127744 && i19 <= 131071) {
                        iMax = Math.max(iMax, i19);
                    }
                    i18++;
                }
                int i20 = iMax >= 127744 ? iMax - 127743 : 0;
                int[] iArr4 = new int[i20];
                Arrays.fill(iArr4, -1);
                int[] iArr5 = new int[448];
                Arrays.fill(iArr5, -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i10; i22++) {
                    int i23 = iArr2[i22];
                    int i24 = i23 - 127744;
                    boolean z = i24 >= 0 && i24 < i20;
                    int i25 = i23 - 9728;
                    boolean z2 = i25 >= 0 && i25 < 448;
                    if (!z && !z2) {
                        i21++;
                    }
                }
                int[] iArr6 = new int[i21];
                int[] iArr7 = new int[i21];
                int i26 = 0;
                while (i4 < i10) {
                    int i27 = iArr2[i4];
                    int i28 = iArr3[i4];
                    int i29 = i3;
                    int i30 = i27 - i29;
                    if (i30 < 0 || i30 >= i20) {
                        int i31 = i27 - 9728;
                        if (i31 < 0 || i31 >= 448) {
                            iArr6[i26] = i27;
                            iArr7[i26] = i28;
                            i26++;
                        } else {
                            iArr5[i31] = i28;
                        }
                    } else {
                        iArr4[i30] = i28;
                    }
                    i4++;
                    i3 = i29;
                }
                wjhVar = new wjh((long[]) ac1Var.e, iArr4, iArr5, iArr6, iArr7, (byte) 29);
            }
            this.g = (long[]) wjhVar.b;
            this.i = (int[]) wjhVar.c;
            this.j = (int[]) wjhVar.d;
            this.k = (int[]) wjhVar.e;
            this.l = (int[]) wjhVar.f;
        }
    }

    public cyd(WebPictureInPictureActivity webPictureInPictureActivity) {
        this.a = (byte) 2;
        this.l = webPictureInPictureActivity;
        this.c = b(0, 2, 2131232038, 2132017231, null);
        this.d = b(1, 0, 2131231962, 2132017227, null);
        this.e = b(2, 1, 2131231952, 2132017225, null);
        this.f = b(3, 0, 2131232508, 2132017232, null);
        this.g = b(4, 3, 2131232037, 2132017212, null);
        this.h = b(5, 15, 2131231804, 2132017205, null);
        Boolean bool = Boolean.TRUE;
        RemoteAction remoteActionB = b(6, 13, 2131232321, 2132017209, bool);
        Boolean bool2 = Boolean.FALSE;
        this.i = new eyi(remoteActionB, b(7, 13, 2131232320, 2132017257, bool2));
        this.j = new eyi(b(8, 14, 2131232567, 2132017255, bool), b(9, 14, 2131232568, 2132017256, bool2));
        this.b = 2;
        this.k = new HashSet();
    }

    public cyd(j9h j9hVar, b2j b2jVar, Executor executor) {
        this.a = (byte) 1;
        this.f = null;
        this.g = null;
        this.h = null;
        this.b = 1;
        this.i = new q0b(new IllegalStateException("Cannot close the encoder before configuring."), (byte) 1);
        this.j = null;
        this.k = new q0b(new IllegalStateException("Cannot close the encoder before configuring."), (byte) 1);
        this.l = null;
        this.c = executor;
        this.d = b2jVar;
        this.e = j9hVar;
    }

    public static boolean d(int i) {
        if (i < 128) {
            return i < 64 && ((1 << i) & 287953333581250560L) != 0;
        }
        if (i >= 176 && i <= 8191) {
            return false;
        }
        if (i < 13056 || i > 65535) {
            return (i < 65536 || i > 126975) && i <= 131071;
        }
        return false;
    }

    public final void a() {
        int iA = vep.A(this.b);
        if (iA == 0 || iA == 1) {
            e();
            return;
        }
        if (iA == 2 || iA == 3) {
            this.b = 3;
        } else {
            if (iA == 4) {
                return;
            }
            qp2.j(z1m.y(this.b), " is not handled", "State ");
        }
    }

    public final RemoteAction b(int i, int i2, int i3, int i4, Boolean bool) {
        Intent intent = new Intent("com.opera.android.media.WebPictureInPictureActivity.MediaAction");
        WebPictureInPictureActivity webPictureInPictureActivity = (WebPictureInPictureActivity) this.l;
        intent.setPackage(webPictureInPictureActivity.getPackageName());
        intent.putExtra("com.opera.android.media.WebPictureInPictureActivity.ReceiverToken", webPictureInPictureActivity.r.hashCode());
        intent.putExtra("com.opera.android.media.WebPictureInPictureActivity.ControlType", i2);
        intent.putExtra("com.opera.android.media.WebPictureInPictureActivity.NativePointer", webPictureInPictureActivity.j);
        if (bool != null) {
            intent.putExtra("com.opera.android.media.WebPictureInPictureActivity.ControlState", bool);
        }
        return new RemoteAction(Icon.createWithResource(webPictureInPictureActivity.getApplicationContext(), i3), webPictureInPictureActivity.getApplicationContext().getResources().getText(i4), "", PendingIntent.getBroadcast(webPictureInPictureActivity.getApplicationContext(), i, intent, 201326592));
    }

    public final kam c(int i) {
        kam kamVar;
        kam kamVar2 = ((kam[]) this.h)[i];
        if (kamVar2 != null) {
            return kamVar2;
        }
        synchronized (this.f) {
            kamVar = ((kam[]) this.h)[i];
            if (kamVar == null) {
                kamVar = new kam(this, i);
                ((kam[]) this.h)[i] = kamVar;
            }
        }
        return kamVar;
    }

    public final void e() {
        int iA = vep.A(this.b);
        if (iA == 0) {
            this.b = 5;
            return;
        }
        byte b = 2;
        if (iA != 1 && iA != 2 && iA != 3) {
            int i = this.b;
            if (iA == 4) {
                return;
            }
            qp2.j(z1m.y(i), " is not handled", "State ");
            return;
        }
        this.b = 5;
        ((l94) this.l).b((f28) this.f);
        this.h = null;
        f28 f28Var = (f28) this.f;
        if (f28Var == null) {
            ((l94) this.j).b(null);
            return;
        }
        Objects.toString(f28Var);
        f28 f28Var2 = (f28) this.f;
        f28Var2.g.execute(new y18(f28Var2, b));
        ((f28) this.f).h.addListener(new y1n(this, (byte) 4), (b2j) this.d);
        this.f = null;
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((buk) this.h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }
}
