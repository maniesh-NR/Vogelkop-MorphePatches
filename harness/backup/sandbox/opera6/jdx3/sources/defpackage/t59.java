package defpackage;

import android.os.SystemClock;
import android.util.SparseLongArray;
import com.opera.android.widget.GraphView;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class t59 implements fqp {
    public static final t59 d = new t59(0, 0, (String) null);
    public long a;
    public long b;
    public Object c;

    public t59(byte b) {
        switch (b) {
            case 5:
                this.c = new i7f();
                break;
            default:
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                break;
        }
    }

    public t59(long j) {
        this.c = new LinkedHashMap(100, 0.75f, true);
        this.a = j;
    }

    public t59(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public t59(FileChannel fileChannel, long j, long j2) {
        this.c = fileChannel;
        this.a = j;
        this.b = j2;
    }

    public t59(p3a p3aVar, int i) {
        this.c = new SparseLongArray();
        ArrayList arrayList = new ArrayList(i);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int iD = p3aVar.d() - 1;
        while (true) {
            long jE = 0;
            if (iD < 0 || arrayList.size() >= i) {
                break;
            }
            ta6 ta6VarF = p3aVar.f(iD);
            boolean zE = ta6VarF.e(gregorianCalendar);
            if (zE) {
                gregorianCalendar = new GregorianCalendar(ta6VarF.a, ta6VarF.b, ta6VarF.c);
                jE = p3aVar.e(iD);
            }
            gregorianCalendar.add(5, -1);
            arrayList.add(Long.valueOf(jE));
            if (zE) {
                iD--;
            }
        }
        while (arrayList.size() < i) {
            arrayList.add(0L);
        }
        long jMax = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            long jLongValue = ((Long) arrayList.get((arrayList.size() - 1) - i2)).longValue();
            jMax = Math.max(jMax, jLongValue);
            SparseLongArray sparseLongArray = (SparseLongArray) this.c;
            sparseLongArray.append(sparseLongArray.size(), jLongValue);
            SparseLongArray sparseLongArray2 = (SparseLongArray) this.c;
            sparseLongArray2.append(sparseLongArray2.size(), jLongValue);
        }
        this.a = ((SparseLongArray) this.c).size() - 1;
        this.b = jMax == 0 ? 1L : jMax;
    }

    public final void a() {
        float f;
        w05 w05Var = (w05) this.c;
        long j = this.b;
        if (j > 0) {
            double d2 = this.a / j;
            if (d2 < 0.0d) {
                d2 = 0.0d;
            }
            f = (float) d2;
        } else {
            f = 0.0f;
        }
        if (f == w05Var.c) {
            return;
        }
        w05Var.c = f;
        w05Var.invalidateSelf();
    }

    public final void b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = ((FileChannel) this.c).map(FileChannel.MapMode.READ_ONLY, this.a + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public final void c() {
        w05 w05Var = (w05) this.c;
        v05 v05VarA = v05.a((v05) w05Var.e, null, new int[]{-6876417, -12032513, -7341569, -6876417, -32687, -6876417}, new float[]{0.0f, 0.16f, 0.37f, 0.55f, 0.72f, 1.0f}, 1);
        if (v05VarA.equals((v05) w05Var.e)) {
            return;
        }
        w05Var.e = v05VarA;
        w05Var.d.setShader(null);
        w05Var.invalidateSelf();
    }

    public final void d(GraphView graphView) {
        float f = this.a;
        float f2 = this.b;
        graphView.j = f;
        graphView.k = f2;
        graphView.l = true;
        graphView.invalidate();
        SparseLongArray sparseLongArray = (SparseLongArray) this.c;
        SparseLongArray sparseLongArray2 = graphView.f;
        sparseLongArray2.clear();
        graphView.o = -1;
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray2.put(sparseLongArray.keyAt(i), sparseLongArray.valueAt(i));
            if (graphView.o == -1 && sparseLongArray.valueAt(i) > 0) {
                graphView.o = i;
            }
        }
        graphView.l = true;
        graphView.invalidate();
    }

    public final synchronized Object e(Object obj) {
        return ((LinkedHashMap) this.c).get(obj);
    }

    public int f(Object obj) {
        return 1;
    }

    public final void g() {
        g7f g7fVar = new g7f((i7f) this.c);
        while (g7fVar.hasNext()) {
            gz4 gz4Var = (gz4) g7fVar.next();
            long j = this.b;
            h7f h7fVar = gz4Var.a.C;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((iz4) g7fVarH.next()).f(j);
            }
        }
    }

    public final void h() {
        g7f g7fVar = new g7f((i7f) this.c);
        while (g7fVar.hasNext()) {
            gz4 gz4Var = (gz4) g7fVar.next();
            long j = this.a;
            h7f h7fVar = gz4Var.a.C;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((iz4) g7fVarH.next()).D(j);
            }
        }
    }

    public void i(Object obj, Object obj2) {
    }

    public final synchronized Object j(Object obj, Object obj2) {
        long jF = f(obj2);
        if (jF >= this.a) {
            i(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.b += jF;
        }
        Object objPut = ((LinkedHashMap) this.c).put(obj, obj2);
        if (objPut != null) {
            this.b -= f(objPut);
            if (!objPut.equals(obj2)) {
                i(obj, objPut);
            }
        }
        l(this.a);
        return objPut;
    }

    public final void k(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L && ll6.c0.get() <= 0) {
            this.a = 200 + jElapsedRealtime;
        }
        long j = this.a;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }

    public final synchronized void l(long j) {
        while (this.b > j) {
            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.b -= f(value);
            Object key = entry.getKey();
            it.remove();
            i(key, value);
        }
    }

    public final long zza() {
        return this.b;
    }
}
