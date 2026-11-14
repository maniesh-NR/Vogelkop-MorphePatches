package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u29 extends kuk implements Function1 {
    public final /* synthetic */ byte t = 1;
    public boolean u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u29(Function1 function1, fl6 fl6Var, String str, mt5 mt5Var) {
        super(1, mt5Var);
        this.w = function1;
        this.x = fl6Var;
        this.y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u29(v29 v29Var, Object obj, mt5 mt5Var) {
        super(1, mt5Var);
        this.x = v29Var;
        this.y = obj;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        Object obj = this.y;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                return new u29((v29) obj2, obj, mt5Var);
            default:
                return new u29((Function1) this.w, (fl6) obj2, (String) obj, mt5Var);
        }
    }

    public final Object invoke(Object obj) {
        mt5 mt5Var = (mt5) obj;
        switch (this.t) {
        }
        return create(mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Function1 function1;
        byte b = this.t;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                v29 v29Var = (v29) obj3;
                File file = v29Var.a;
                Unit unit = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            u2j u2jVar = v29Var.b;
                            b04 b04Var = new b04(fileOutputStream3);
                            this.v = fileOutputStream3;
                            this.w = fileOutputStream3;
                            this.u = true;
                            if (u2jVar.writeTo(obj2, b04Var) == unit) {
                                return unit;
                            }
                            fileOutputStream = fileOutputStream3;
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw z5i.F0(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = (FileOutputStream) this.w;
                    fileOutputStream = (FileOutputStream) this.v;
                    try {
                        ybh.y(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            vtp.v(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                vtp.v(fileOutputStream, null);
                return Unit.a;
            default:
                px5 px5Var = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    Function1 function12 = (Function1) this.w;
                    this.v = function12;
                    this.u = true;
                    ((fl6) obj3).getClass();
                    Object objB = fl6.b((String) obj2);
                    if (objB == px5Var) {
                        return px5Var;
                    }
                    obj = objB;
                    function1 = function12;
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = (Function1) this.v;
                    ybh.y(obj);
                }
                return function1.invoke(obj);
        }
    }
}
