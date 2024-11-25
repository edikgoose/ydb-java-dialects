package tech.ydb.exposed.sql

import org.jetbrains.exposed.sql.vendors.DataTypeProvider
import org.jetbrains.exposed.sql.vendors.FunctionProvider
import org.jetbrains.exposed.sql.vendors.VendorDialect

class YdbDialect(override val name: String = dialectName) :
    VendorDialect(dialectName, YdbDataTypeProvider, YdbFunctionProvider) {

    companion object : DialectNameProvider("YDB")
}

internal object YdbDataTypeProvider : DataTypeProvider() {
    override fun binaryType(): String {
        TODO()
    }

    override fun hexToDb(hexString: String): String {
        TODO()
    }
}


internal object YdbFunctionProvider : FunctionProvider()