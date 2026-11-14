package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class cp extends cej {
    public final mq a;
    public final int b;
    public final List c;

    public cp(mq mqVar, int i, List list) {
        this.a = mqVar;
        this.b = i;
        this.c = list;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        return new dp(mejVar, this.a, this.b, this.c);
    }
}
