<?php 
	$pim = $_MB["PATTERN_INSTANCE_MANAGER"]; 
?>
<?xml version="1.0" encoding="UTF-8"?>
<schema xmlns="http://www.w3.org/2001/XMLSchema" xmlns:tns="http://www.ibm.com/Ben/" targetNamespace="http://www.ibm.com/Ben/">
    <element name="Message" type="tns:MessageType"></element>
    <complexType name="MessageType">
        <sequence>
<?php 
	$table = $pim->getParameterTable("ppTrigger1Fields");
	$count = $table->getRowCount();
	for ($j=0;$j<$count ;$j++ ) {	
		echo "            <element name=\"".$_MB['PP']['ppTrigger1Fields'][$j]['fieldName']."\" type=\"string\"></element>\n";		
	} 
?>
        </sequence>
    </complexType>    
</schema>

