package org.benf.cfr.reader.util.output;

import org.benf.cfr.reader.bytecode.analysis.types.JavaTypeInstance;
import org.benf.cfr.reader.entities.Method;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 20/11/2013
 * Time: 13:03
 */
public interface SummaryDumper {
    void notify(String message);

    void notifyError(JavaTypeInstance controllingType, Method method, String error);

    void close();
}