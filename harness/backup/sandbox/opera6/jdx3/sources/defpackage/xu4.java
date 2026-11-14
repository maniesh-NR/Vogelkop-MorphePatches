package defpackage;

import com.opera.android.suggestion.Suggestion;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class xu4 implements odb {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public xu4(ole oleVar) {
        this.a = (byte) 2;
        this.b = oleVar;
        this.c = new LinkedHashSet();
    }

    public xu4(x5f x5fVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = x5fVar;
                this.c = new LinkedHashMap();
                break;
            default:
                this.b = x5fVar;
                this.c = new LinkedHashSet();
                break;
        }
    }

    public final void a(Suggestion suggestion) {
        String str;
        tej tejVar;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                Object obj2 = suggestion.k;
                jfj jfjVar = obj2 instanceof jfj ? (jfj) obj2 : null;
                if (jfjVar != null) {
                    LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                    String str2 = jfjVar.a;
                    List list = jfjVar.f;
                    if (list == null || (tejVar = (tej) CollectionsKt.firstOrNull(list)) == null || (str = tejVar.a) == null) {
                        str = "unknown";
                    }
                    linkedHashSet.add(new wu4(str2, str));
                    break;
                }
                break;
            case 1:
                Object obj3 = suggestion.k;
                nt8 nt8Var = obj3 instanceof nt8 ? (nt8) obj3 : null;
                if (nt8Var != null) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                    Object obj4 = linkedHashMap.get(nt8Var);
                    Object obj5 = obj4;
                    if (obj4 == null) {
                        rt8 rt8Var = new rt8();
                        linkedHashMap.put(nt8Var, rt8Var);
                        obj5 = rt8Var;
                    }
                    rt8 rt8Var2 = (rt8) obj5;
                    if ((rt8Var2.a ? 1L : 0L) == 0) {
                        rt8Var2.a = true;
                        break;
                    }
                }
                break;
            default:
                if (((LinkedHashSet) obj).add(Integer.valueOf(suggestion.j))) {
                    b3g b3gVar = new b3g(3);
                    b3gVar.a(suggestion.j).b++;
                    ((ole) this.b).C(b3gVar);
                    break;
                }
                break;
        }
    }

    public final void b(Suggestion suggestion) {
        String str;
        tej tejVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Object obj2 = suggestion.k;
                jfj jfjVar = obj2 instanceof jfj ? (jfj) obj2 : null;
                if (jfjVar != null) {
                    x5f x5fVar = (x5f) obj;
                    String str2 = jfjVar.a;
                    List list = jfjVar.f;
                    if (list == null || (tejVar = (tej) CollectionsKt.firstOrNull(list)) == null || (str = tejVar.a) == null) {
                        str = "unknown";
                    }
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).d().c(str2, new tx0(str, (byte) 27));
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
            case 1:
                Object obj3 = suggestion.k;
                nt8 nt8Var = obj3 instanceof nt8 ? (nt8) obj3 : null;
                if (nt8Var != null) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                    Object obj4 = linkedHashMap.get(nt8Var);
                    Object obj5 = obj4;
                    if (obj4 == null) {
                        rt8 rt8Var = new rt8();
                        linkedHashMap.put(nt8Var, rt8Var);
                        obj5 = rt8Var;
                    }
                    ((rt8) obj5).b++;
                    break;
                }
                break;
            default:
                b3g b3gVar = new b3g(3);
                b3gVar.a(suggestion.j).c++;
                ((ole) obj).C(b3gVar);
                break;
        }
    }

    public final void reset() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                LinkedHashSet<wu4> linkedHashSet = (LinkedHashSet) obj2;
                for (wu4 wu4Var : linkedHashSet) {
                    x5f x5fVar = (x5f) obj;
                    String str = wu4Var.a;
                    String str2 = wu4Var.b;
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).d().c(str, new tx0(str2, (byte) 28));
                    x5fVar.U0(x56VarF);
                }
                linkedHashSet.clear();
                break;
            case 1:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    nt8 nt8Var = (nt8) entry.getKey();
                    rt8 rt8Var = (rt8) entry.getValue();
                    x5f x5fVar2 = (x5f) obj;
                    String str3 = nt8Var.b;
                    long j = rt8Var.a ? 1L : 0L;
                    long j2 = rt8Var.b;
                    if (x5fVar2.h) {
                        x5fVar2.T0(new f5f(str3, j, j2, (byte) 0));
                    }
                }
                linkedHashMap.clear();
                break;
            default:
                ((LinkedHashSet) obj2).clear();
                break;
        }
    }
}
