package dev.files;

public class Statistics {

    private final String Year;
    private final String Industry_aggregation_NZSIOC;
    private final String Industry_code_NZSIOC;
    private final String Industry_name_NZSIOC;
    private final String Units;
    private final String Variable_code;
    private final String Variable_name;
    private final String Variable_category;
    private final String Value;
    private final String Industry_code_ANZSIC06;

    public Statistics(String year, String industry_aggregation_NZSIOC, String industry_code_NZSIOC, String industry_name_NZSIOC, String units, String variable_code, String variable_name, String variable_category, String value, String industry_code_ANZSIC06) {
        Year = year;
        Industry_aggregation_NZSIOC = industry_aggregation_NZSIOC;
        Industry_code_NZSIOC = industry_code_NZSIOC;
        Industry_name_NZSIOC = industry_name_NZSIOC;
        Units = units;
        Variable_code = variable_code;
        Variable_name = variable_name;
        Variable_category = variable_category;
        Value = value;
        Industry_code_ANZSIC06 = industry_code_ANZSIC06;


    }

    public String getVariable_code() {
        return Variable_code;
    }
}
