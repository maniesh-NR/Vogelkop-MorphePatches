package defpackage;

import ads_mobile_sdk.pd;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class j77 extends RuntimeException {
    public final yg5 a;

    public j77(yg5 yg5Var) {
        this.a = yg5Var;
        if (yg5Var.b) {
            return;
        }
        int[] iArr = {pd.d1, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = yg5Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            zg5 zg5Var = (zg5) list.get(i);
            if (e82.t(zg5Var.a, iArr) < 0) {
                if (zg5Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((zg5) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        o95.y(arrayList);
                    }
                } else {
                    arrayList.add(zg5Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", sko.i(((zg5) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        yg5 yg5Var = this.a;
        if (!yg5Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        ehc ehcVarB = a.b();
        tcd tcdVar = new tcd(yg5Var.a, (byte) 1);
        int iD = tcdVar.d();
        for (int i = 0; i < iD; i++) {
            ((zg5) tcdVar.get(i)).getClass();
        }
        tcd tcdVar2 = new tcd(a.a(ehcVarB), (byte) 1);
        int iD2 = tcdVar2.d();
        for (int i2 = 0; i2 < iD2; i2++) {
            String str = (String) tcdVar2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
