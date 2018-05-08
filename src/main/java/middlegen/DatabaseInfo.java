/*
 * Copyright (c) 2001, Aslak Hellesøy, BEKK Consulting
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * - Neither the name of BEKK Consulting nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.
 */
package middlegen;

/**
 * Describe what this class does
 */
public class DatabaseInfo {
    /**
     * @todo-javadoc Describe the field
     */
    private final String _databaseProductName;
    /**
     * @todo-javadoc Describe the field
     */
    private final String _databaseProductVersion;
    /**
     * @todo-javadoc Describe the field
     */
    private final String _driverName;
    /**
     * @todo-javadoc Describe the field
     */
    private final String _driverVersion;

    /**
     * Describe what the DatabaseInfo constructor does
     */
    public DatabaseInfo(String databaseProductName, String databaseProductVersion,
                        String driverName, String driverVersion) {
        _databaseProductName = databaseProductName;
        _databaseProductVersion = databaseProductVersion;
        _driverName = driverName;
        _driverVersion = driverVersion;
    }

    /**
     * Gets the DatabaseProductName attribute of the DatabaseInfo object
     *
     * @return The DatabaseProductName value
     */
    public String getDatabaseProductName() {
        return _databaseProductName;
    }

    /**
     * Gets the DatabaseProductVersion attribute of the DatabaseInfo object
     *
     * @return The DatabaseProductVersion value
     */
    public String getDatabaseProductVersion() {
        return _databaseProductVersion;
    }

    /**
     * Gets the DriverName attribute of the DatabaseInfo object
     *
     * @return The DriverName value
     */
    public String getDriverName() {
        return _driverName;
    }

    /**
     * Gets the DriverVersion attribute of the DatabaseInfo object
     *
     * @return The DriverVersion value
     */
    public String getDriverVersion() {
        return _driverVersion;
    }
    
}
