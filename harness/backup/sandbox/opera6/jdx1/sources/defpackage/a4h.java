package defpackage;

import ads_mobile_sdk.g;
import ads_mobile_sdk.j;
import ads_mobile_sdk.ml3;
import ads_mobile_sdk.ov;
import android.content.Context;
import android.text.Spanned;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.json.b;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class a4h {
    public static final int a = 15;

    public static String a(String str, int i) {
        return sko.i(i, str);
    }

    public static final Object b(Task task, CancellationTokenSource cancellationTokenSource, nt5 nt5Var) throws Exception {
        if (!task.isComplete()) {
            nh4 nh4Var = new nh4(1, hib.b(nt5Var));
            nh4Var.s();
            task.addOnCompleteListener(n97.c, new bxk(nh4Var, (byte) 3));
            if (cancellationTokenSource != null) {
                nh4Var.u(new v91(cancellationTokenSource, (byte) 19));
            }
            Object objQ = nh4Var.q();
            px5 px5Var = px5.a;
            return objQ;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static flp c(g gVar, long j) {
        ov ovVar = ml3.c;
        flp flpVar = (flp) ((Unsafe) ovVar.a).getObject(gVar, j);
        if (((j) flpVar).a) {
            return flpVar;
        }
        int size = flpVar.size();
        flp flpVarA = flpVar.a(size == 0 ? 10 : size << 1);
        ovVar.a(j, gVar, flpVarA);
        return flpVarA;
    }

    public static nej f(Context context) {
        return (nej) context.getSystemService("com.opera.android.ui.SHEET_QUEUE_SERVICE");
    }

    public static final String g(ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.j(j41.a);
        return ((Context) vt9Var.j(j41.b)).getResources().getString(i);
    }

    public static final boolean k(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static tth p(byte[] bArr) {
        String strConcat = "0x".concat(naa.g(bArr));
        ldh ldhVar = new ldh(1, x1.a, x1.class, "decodeUInt", "decodeUInt(Ljava/lang/String;)Ljava/math/BigInteger;", 0, (byte) 6);
        sth[] sthVarArr = {new r40((byte) 5, strConcat, false)};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(sthVarArr[0].k());
        return new tth("eth_sendRawTransaction", (b[]) arrayList.toArray(new b[0]), ldhVar);
    }

    public static final double r(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final void s(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static Pair t(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        u(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i3 = iCapacity - 22;
            int iMin = Math.min(i3, 65535);
            for (int i4 = 0; i4 < iMin; i4++) {
                i2 = i3 - i4;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
            i2 = -1;
        } else {
            i2 = -1;
        }
        if (i2 == -1) {
            return null;
        }
        byteBufferAllocate.position(i2);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i2));
    }

    public static void u(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        qp2.o("ByteBuffer byte order must be little endian");
    }

    public abstract int d(int i, View view);

    public int e(int i, View view) {
        return view.getTop();
    }

    public abstract Object h(hx9 hx9Var, mt5 mt5Var);

    public int i(View view) {
        return 0;
    }

    public int j() {
        return 0;
    }

    public void l(int i, View view) {
    }

    public abstract void m(int i);

    public abstract void n(View view, int i, int i2);

    public abstract void o(View view, float f, float f2);

    public abstract boolean q(int i, View view);
}
