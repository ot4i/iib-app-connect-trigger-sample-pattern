<?php 
	$pim = $_MB["PATTERN_INSTANCE_MANAGER"]; 
?>
{
	"title": "<?php echo $_MB['PP']['ppTrigger1Name']."\","."\n"; ?>
    "type": "object",
    "properties": {
<?php 
	$table = $pim->getParameterTable("ppTrigger1Fields");
	$count = $table->getRowCount();
	for ($j=0;$j<$count ;$j++ ) {
		echo "      \"".$_MB['PP']['ppTrigger1Fields'][$j]['fieldName']."\": {\"type\":  \"string\"}";
		if ($j < ($count-1)) {echo ",\n";}				
	} 
?>

	}
}
