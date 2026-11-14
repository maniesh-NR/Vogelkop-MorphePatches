package defpackage;

import android.database.Cursor;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class y5i {
    public a64 a;
    public CoroutineContext b;
    public Executor c;
    public op1 d;
    public xbf e;
    public pjb f;
    public final qb7 g;
    public boolean h;
    public final ThreadLocal i;
    public final LinkedHashMap j;
    public boolean k;

    public y5i() {
        new e6g(0, this, y5i.class, "onClosed", "onClosed()V", 0, (byte) 19);
        qb7 qb7Var = new qb7();
        qb7Var.a = new AtomicInteger(0);
        qb7Var.b = new AtomicBoolean(false);
        qb7Var.c = new AtomicBoolean(false);
        this.g = qb7Var;
        this.i = new ThreadLocal();
        this.j = new LinkedHashMap();
        this.k = true;
    }

    public final void a() {
        if (!this.h && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qp2.n("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!n() || o()) {
            return;
        }
        CoroutineContext coroutineContext = (CoroutineContext) this.i.get();
        if ((coroutineContext != null ? (k0m) coroutineContext.get(k0m.b) : null) != null) {
            qp2.n("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        to9 writableDatabase = i().getWritableDatabase();
        if (!writableDatabase.p()) {
            pjb pjbVar = this.f;
            mt5 mt5Var = null;
            if (pjbVar == null) {
                pjbVar = null;
            }
            pjbVar.getClass();
            bwg.B(new ojb(pjbVar, mt5Var, (byte) 2));
        }
        if (writableDatabase.a.isWriteAheadLoggingEnabled()) {
            writableDatabase.k();
        } else {
            writableDatabase.h();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(qbd.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((itb) entry.getKey()).a(), entry.getValue());
        }
        return h();
    }

    public abstract pjb e();

    public c6i f() {
        throw new g0f(null, 1, null);
    }

    public qsk g(ng6 ng6Var) {
        throw new g0f(null, 1, null);
    }

    public List h() {
        return l08.a;
    }

    public final qsk i() {
        xbf xbfVar = this.e;
        if (xbfVar == null) {
            xbfVar = null;
        }
        qsk qskVar = (qsk) xbfVar.f;
        if (qskVar != null) {
            return qskVar;
        }
        qp2.n("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set j() {
        Set setK = k();
        ArrayList arrayList = new ArrayList(k95.o(setK, 10));
        Iterator it = setK.iterator();
        while (it.hasNext()) {
            arrayList.add(uqh.a((Class) it.next()));
        }
        return CollectionsKt.n0(arrayList);
    }

    public Set k() {
        return v08.a;
    }

    public LinkedHashMap l() {
        Set<Map.Entry> setEntrySet = m().entrySet();
        int iA = qbd.a(k95.o(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            s15 s15VarA = uqh.a(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(k95.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(uqh.a((Class) it.next()));
            }
            linkedHashMap.put(s15VarA, arrayList);
        }
        return linkedHashMap;
    }

    public Map m() {
        return n08.a;
    }

    public final boolean n() {
        xbf xbfVar = this.e;
        if (xbfVar == null) {
            xbfVar = null;
        }
        return ((qsk) xbfVar.f) != null;
    }

    public final boolean o() {
        return r() && i().getWritableDatabase().p();
    }

    public final void p() {
        i().getWritableDatabase().m();
        if (o()) {
            return;
        }
        pjb pjbVar = this.f;
        if (pjbVar == null) {
            pjbVar = null;
        }
        pjbVar.b.j(pjbVar.f, pjbVar.g);
    }

    public final void q(osk oskVar) {
        pjb pjbVar = this.f;
        if (pjbVar == null) {
            pjbVar = null;
        }
        g7m g7mVar = pjbVar.b;
        g7mVar.getClass();
        wsk wskVarH = oskVar.h("PRAGMA query_only");
        try {
            wskVarH.n();
            boolean zK = wskVarH.k();
            fr3.t(wskVarH, null);
            if (!zK) {
                nxg.k(oskVar, "PRAGMA temp_store = MEMORY");
                nxg.k(oskVar, "PRAGMA recursive_triggers = 1");
                nxg.k(oskVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (g7mVar.a) {
                    nxg.k(oskVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    nxg.k(oskVar, c.o("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                d7f d7fVar = (d7f) g7mVar.h;
                ReentrantLock reentrantLock = d7fVar.a;
                reentrantLock.lock();
                try {
                    d7fVar.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (pjbVar.i) {
            }
        } finally {
        }
    }

    public final boolean r() {
        xbf xbfVar = this.e;
        if (xbfVar == null) {
            xbfVar = null;
        }
        to9 to9Var = (to9) xbfVar.g;
        if (to9Var != null) {
            return to9Var.isOpen();
        }
        return false;
    }

    public final Cursor s(ssk sskVar) {
        a();
        b();
        return i().getWritableDatabase().q(sskVar);
    }

    public final Object t(Callable callable) {
        return u(new j3i(callable, (byte) 3));
    }

    public final Object u(Function0 function0) {
        if (!n()) {
            return kfo.Y(this, false, true, new p01(function0, (byte) 11));
        }
        c();
        try {
            Object objInvoke = function0.invoke();
            v();
            return objInvoke;
        } finally {
            p();
        }
    }

    public final void v() {
        i().getWritableDatabase().s();
    }

    public final Object w(boolean z, Function2 function2, mt5 mt5Var) {
        ynh.k(this);
        xbf xbfVar = this.e;
        mt5 mt5Var2 = null;
        if (xbfVar == null) {
            xbfVar = null;
        }
        l3g l3gVar = (l3g) xbfVar.e;
        l3gVar.getClass();
        k3g k3gVar = (k3g) mt5Var.getContext().get(k3g.b);
        j3g j3gVar = k3gVar != null ? k3gVar.a : null;
        if (j3gVar != null) {
            return function2.invoke(j3gVar, mt5Var);
        }
        j3g j3gVar2 = new j3g(l3gVar.c, (osk) l3gVar.d.getValue());
        return na2.Z(new k3g(j3gVar2), new qmb((Object) function2, (Object) j3gVar2, mt5Var2, (byte) 23), mt5Var);
    }
}
