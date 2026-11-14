package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vik implements mvd {
    private final int[] checkInitialized;
    private final rvd defaultInstance;
    private final b09[] fields;
    private final boolean messageSetWireFormat;
    private final t6h syntax;

    public static final class a {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<b09> fields;
        private boolean messageSetWireFormat;
        private t6h syntax;
        private boolean wasBuilt;

        public a() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public a(int i) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i);
        }

        public vik build() {
            if (this.wasBuilt) {
                qp2.n("Builder can only build once");
                return null;
            }
            if (this.syntax == null) {
                qp2.n("Must specify a proto syntax");
                return null;
            }
            this.wasBuilt = true;
            Collections.sort(this.fields);
            return new vik(this.syntax, this.messageSetWireFormat, this.checkInitialized, (b09[]) this.fields.toArray(new b09[0]), this.defaultInstance);
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(b09 b09Var) {
            if (this.wasBuilt) {
                qp2.n("Builder can only build once");
            } else {
                this.fields.add(b09Var);
            }
        }

        public void withMessageSetWireFormat(boolean z) {
            this.messageSetWireFormat = z;
        }

        public void withSyntax(t6h t6hVar) {
            this.syntax = (t6h) ifb.checkNotNull(t6hVar, "syntax");
        }
    }

    public vik(t6h t6hVar, boolean z, int[] iArr, b09[] b09VarArr, Object obj) {
        this.syntax = t6hVar;
        this.messageSetWireFormat = z;
        this.checkInitialized = iArr;
        this.fields = b09VarArr;
        this.defaultInstance = (rvd) ifb.checkNotNull(obj, "defaultInstance");
    }

    public static a newBuilder() {
        return new a();
    }

    public static a newBuilder(int i) {
        return new a(i);
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // defpackage.mvd
    public rvd getDefaultInstance() {
        return this.defaultInstance;
    }

    public b09[] getFields() {
        return this.fields;
    }

    @Override // defpackage.mvd
    public t6h getSyntax() {
        return this.syntax;
    }

    @Override // defpackage.mvd
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }
}
