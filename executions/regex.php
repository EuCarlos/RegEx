<?php

$re = '/[a-f]/i';
$str = 'any text here 1 2 3 4 5';

preg_match_all($re, $str, $matches);

// Print the entire match result
foreach ($matches as $val) {
    echo $val[0] . $val[1] . $val[2] . $val[3] . $val[4]; // Return aeee

$result = preg_replace($re, '*', $str); // Return *ny t*xt h*r* 1 2 3 4 5

echo $result;

