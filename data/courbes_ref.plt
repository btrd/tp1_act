set xrange [0:30]
set yrange [0:30]
plot "comparaisons_refs.txt" using 1:2 title "f(n)=n" with lines, "comparaisons_refs.txt" using 1:3 title "g(n)=log(n)" with lines, "comparaisons_refs.txt" using 1:4 title "k(n)=nlog(n)" with lines, "comparaisons_refs.txt" using 1:5 title "l(n)=exp(n)" with lines, "comparaisons_refs.txt" using 1:6 title "m(n)=k^n" with lines, "comparaisons_refs.txt" using 1:7 title "q(n)=n!" with lines, "comparaisons_refs.txt" using 1:8 title "r(n)=n^n" with lines
pause -1
