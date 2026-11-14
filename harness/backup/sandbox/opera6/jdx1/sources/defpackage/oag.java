package defpackage;

/* loaded from: classes.dex */
public final class oag extends tag implements ji5 {
    public static final oag g = new oag(u6m.e, 0);

    @Override // defpackage.tag, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof g7h) {
            return super.containsKey((g7h) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof h0n) {
            return super.containsValue((h0n) obj);
        }
        return false;
    }

    @Override // defpackage.tag
    public final wag f() {
        nag nagVar = new nag(this);
        nagVar.g = this;
        return nagVar;
    }

    @Override // defpackage.tag
    public final wag g() {
        nag nagVar = new nag(this);
        nagVar.g = this;
        return nagVar;
    }

    @Override // defpackage.tag, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof g7h) {
            return (h0n) super.get((g7h) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof g7h) ? obj2 : (h0n) super.getOrDefault((g7h) obj, (h0n) obj2);
    }

    public final oag j(g7h g7hVar, h0n h0nVar) {
        n9k n9kVarU = this.d.u(g7hVar, g7hVar.hashCode(), 0, h0nVar);
        return n9kVarU == null ? this : new oag((u6m) n9kVarU.b, this.e + (n9kVarU.a ? 1 : 0));
    }
}
