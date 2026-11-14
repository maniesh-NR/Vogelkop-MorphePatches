package defpackage;

/* loaded from: classes.dex */
public final class nag extends wag {
    public oag g;

    @Override // defpackage.wag, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof g7h) {
            return super.containsKey((g7h) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof h0n) {
            return super.containsValue((h0n) obj);
        }
        return false;
    }

    @Override // defpackage.wag, java.util.AbstractMap, java.util.Map
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

    @Override // defpackage.wag
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final oag f() {
        u6m u6mVar = this.c;
        oag oagVar = this.g;
        if (u6mVar != oagVar.d) {
            this.b = new i06((byte) 19);
            oagVar = new oag(this.c, c());
        }
        this.g = oagVar;
        return oagVar;
    }

    @Override // defpackage.wag, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof g7h) {
            return (h0n) super.remove((g7h) obj);
        }
        return null;
    }
}
