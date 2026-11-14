package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class v6p {
    public Object a = null;
    public HashMap b;

    public final Object a(int i, CharSequence charSequence) {
        if (charSequence.length() <= i) {
            return this.a;
        }
        Character chValueOf = Character.valueOf(charSequence.charAt(i));
        HashMap map = this.b;
        v6p v6pVar = map == null ? null : (v6p) map.get(chValueOf);
        if (v6pVar == null) {
            return null;
        }
        return v6pVar.a(i + 1, charSequence);
    }

    public final Object b(CharSequence charSequence, Object obj, int i) {
        v6p v6pVar;
        if (charSequence.length() == i) {
            Object obj2 = this.a;
            this.a = obj;
            return obj2;
        }
        Character chValueOf = Character.valueOf(charSequence.charAt(i));
        HashMap map = this.b;
        if (map == null) {
            HashMap map2 = new HashMap();
            this.b = map2;
            v6pVar = new v6p();
            map2.put(chValueOf, v6pVar);
        } else {
            v6p v6pVar2 = (v6p) map.get(chValueOf);
            if (v6pVar2 == null) {
                v6pVar2 = new v6p();
                this.b.put(chValueOf, v6pVar2);
            }
            v6pVar = v6pVar2;
        }
        return v6pVar.b(charSequence, obj, i + 1);
    }

    public final void c(StringBuilder sb, HashSet hashSet) {
        int length = sb.length();
        if (this.a != null) {
            hashSet.add(new t6p(sb.toString(), this.a));
        }
        HashMap map = this.b;
        if (map == null || map.size() <= 0) {
            return;
        }
        sb.append('X');
        for (Map.Entry entry : this.b.entrySet()) {
            sb.setCharAt(length, ((Character) entry.getKey()).charValue());
            ((v6p) entry.getValue()).c(sb, hashSet);
        }
        sb.setLength(length);
    }

    public final void d(ArrayList arrayList) {
        Object obj = this.a;
        if (obj != null) {
            arrayList.add(obj);
        }
        HashMap map = this.b;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((v6p) it.next()).d(arrayList);
            }
        }
    }

    public final boolean e(Object obj) {
        Object obj2 = this.a;
        if (obj2 != null && obj.equals(obj2)) {
            return true;
        }
        HashMap map = this.b;
        if (map == null) {
            return false;
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((v6p) it.next()).e(obj)) {
                return true;
            }
        }
        return false;
    }

    public final t6p f(int i, CharSequence charSequence) {
        if (charSequence.length() <= i) {
            Object obj = this.a;
            if (obj != null) {
                return new t6p(charSequence, obj);
            }
            return null;
        }
        Character chValueOf = Character.valueOf(charSequence.charAt(i));
        HashMap map = this.b;
        v6p v6pVar = map == null ? null : (v6p) map.get(chValueOf);
        if (v6pVar == null) {
            Object obj2 = this.a;
            if (obj2 == null) {
                return null;
            }
            if (charSequence.length() > i) {
                charSequence = charSequence.subSequence(0, i);
            }
            return new t6p(charSequence, obj2);
        }
        t6p t6pVarF = v6pVar.f(i + 1, charSequence);
        if (t6pVarF != null) {
            return t6pVarF;
        }
        Object obj3 = this.a;
        if (obj3 == null) {
            return null;
        }
        if (charSequence.length() > i) {
            charSequence = charSequence.subSequence(0, i);
        }
        return new t6p(charSequence, obj3);
    }

    public final void g(StringBuilder sb, HashSet hashSet) {
        int length = sb.length();
        if (this.a != null) {
            hashSet.add(sb.toString());
        }
        HashMap map = this.b;
        if (map == null || map.size() <= 0) {
            return;
        }
        sb.append('X');
        for (Map.Entry entry : this.b.entrySet()) {
            sb.setCharAt(length, ((Character) entry.getKey()).charValue());
            ((v6p) entry.getValue()).g(sb, hashSet);
        }
        sb.setLength(length);
    }
}
