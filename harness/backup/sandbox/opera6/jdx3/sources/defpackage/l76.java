package defpackage;

import j$.util.Collection;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class l76 extends ArrayDeque implements Collection {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public l76(int i) {
        super(i);
        this.a = i;
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        if (size() == this.a) {
            removeLast();
        }
        super.addFirst(obj);
        return true;
    }

    @Override // java.util.ArrayDeque, java.util.Deque
    public final void addFirst(Object obj) {
        if (size() == this.a) {
            removeLast();
        }
        super.addFirst(obj);
    }

    @Override // java.util.ArrayDeque, java.util.Deque
    public final void addLast(Object obj) {
        if (size() == this.a) {
            removeLast();
        }
        super.addLast(obj);
    }
}
