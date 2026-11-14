package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class jp5 implements i6f, mr8, SuccessContinuation, Continuation, v0k, n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ jp5(Object obj, String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public /* synthetic */ jp5(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // defpackage.mr8
    public final boolean d(hq8 hq8Var) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 3:
                return !hq8Var.j() && hq8Var.h().length() <= 25 && hq8Var.h().toLowerCase(Locale.getDefault()).startsWith(str);
            default:
                return str.equals(hq8Var.c());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: arb */
    public final Object e() throws arb {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                throw new arb(str);
            case 1:
                throw new arb(str);
            default:
                throw new arb(str);
        }
    }

    public final Iterator f(vr3 vr3Var, CharSequence charSequence) {
        return new s0k(vr3Var, charSequence, this.b, (byte) 1);
    }

    public final Object g(Object obj) {
        t9f t9fVar = (t9f) xne.b.get();
        fvh fvhVar = new fvh();
        fvhVar.h(this.b);
        j7c.q(fvhVar, t9fVar).enqueue(new ioj((byte) 9));
        return null;
    }

    public final Task then(Object obj) {
        byte b = this.a;
        String str = this.b;
        gwl gwlVar = (gwl) obj;
        switch (b) {
            case 4:
                gwlVar.getClass();
                Task taskA = gwlVar.a(new awl("S", str));
                gwlVar.c();
                return taskA;
            default:
                gwlVar.getClass();
                Task taskA2 = gwlVar.a(new awl("U", str));
                gwlVar.c();
                return taskA2;
        }
    }

    public final Object then(Task task) throws ExecutionException {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 6:
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str2 = (String) task.getResult();
                if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                return str;
            default:
                return !task.isSuccessful() ? Tasks.forException(x79.F(task)) : Tasks.forResult(new Pair((String) task.getResult(), str));
        }
    }
}
