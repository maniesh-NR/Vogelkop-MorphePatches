package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class utp {
    public static final Pattern b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public final qq8 a;

    public utp(qq8 qq8Var) {
        this.a = qq8Var;
    }

    public static void b(eqp eqpVar, htp htpVar) throws IOException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(eqpVar.a);
        } catch (IOException e) {
            e = e;
            zipFile = null;
        }
        try {
            HashMap map = new HashMap();
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = b.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    Set hashSet = (Set) map.get(strGroup);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(strGroup, hashSet);
                    }
                    hashSet.add(new otp(zipEntryNextElement, strGroup2));
                }
            }
            HashMap map2 = new HashMap();
            for (String str : Build.SUPPORTED_ABIS) {
                if (map.containsKey(str)) {
                    for (otp otpVar : (Set) map.get(str)) {
                        String str2 = otpVar.a;
                        if (!map2.containsKey(str2)) {
                            map2.put(str2, otpVar);
                        }
                    }
                }
            }
            htpVar.b(zipFile, new HashSet(map2.values()));
            zipFile.close();
        } catch (IOException e2) {
            e = e2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    w1h.B(e, e3);
                }
            }
            throw e;
        }
    }

    public final HashSet a() throws IOException {
        qq8 qq8Var = this.a;
        HashSet hashSetO = qq8Var.o();
        ArrayList arrayList = new ArrayList();
        File file = new File(qq8Var.x(), "native-libraries");
        qq8.v(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Iterator it = hashSetO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    File file3 = new File(qq8Var.x(), "native-libraries");
                    qq8.v(file3);
                    File fileU = qq8.u(file3, str);
                    qq8.v(fileU);
                    qq8.s(fileU);
                    break;
                }
                if (((eqp) it.next()).b.equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashSetO.iterator();
        while (it2.hasNext()) {
            eqp eqpVar = (eqp) it2.next();
            HashSet hashSet2 = new HashSet();
            b(eqpVar, new oam(this, hashSet2, eqpVar));
            String str2 = eqpVar.b;
            HashSet hashSet3 = new HashSet();
            File file4 = new File(qq8Var.x(), "native-libraries");
            qq8.v(file4);
            File fileU2 = qq8.u(file4, str2);
            qq8.v(fileU2);
            File[] fileArrListFiles2 = fileU2.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file5 : fileArrListFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it3 = hashSet3.iterator();
            while (it3.hasNext()) {
                File file6 = (File) it3.next();
                if (!hashSet2.contains(file6)) {
                    file6.getAbsolutePath();
                    eqpVar.a.getAbsolutePath();
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(qq8Var.x(), "native-libraries");
                    qq8.v(file7);
                    if (!parentFile.equals(file7)) {
                        qp2.n("File to remove is not a native library");
                        return null;
                    }
                    qq8.s(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(eqp eqpVar, HashSet hashSet, jtp jtpVar) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            otp otpVar = (otp) it.next();
            String str = eqpVar.b;
            String str2 = otpVar.a;
            qq8 qq8Var = this.a;
            qq8Var.getClass();
            File file = new File(qq8Var.x(), "native-libraries");
            qq8.v(file);
            File fileU = qq8.u(file, str);
            qq8.v(fileU);
            File fileU2 = qq8.u(fileU, str2);
            boolean z = false;
            if (fileU2.exists() && fileU2.length() == otpVar.b.getSize() && !fileU2.canWrite()) {
                z = true;
            }
            jtpVar.c(otpVar, fileU2, z);
        }
    }
}
