// Unit Production Removal (Set Method using Union)

const grammar = {
  S: ["A", "b"],
  A: ["B", "a"],
  B: ["C", "c"],
  C: ["d"]
};

// Check if production is Unit Production
function isUnitProduction(prod) {
  return prod.length === 1 && prod >= "A" && prod <= "Z";
}

// Step 1: Find UNIT(X) sets
function findUnitSets(grammar) {
  const unitSets = {};

  for (let variable in grammar) {
    unitSets[variable] = new Set([variable]);

    let changed = true;
    while (changed) {
      changed = false;

      for (let item of [...unitSets[variable]]) {
        for (let prod of grammar[item]) {
          if (isUnitProduction(prod) && !unitSets[variable].has(prod)) {
            unitSets[variable].add(prod);
            changed = true;
          }
        }
      }
    }
  }

  return unitSets;
}

// Step 2: Remove Unit Productions
function removeUnitProductions(grammar) {
  const unitSets = findUnitSets(grammar);
  const newGrammar = {};

  for (let variable in grammar) {
    newGrammar[variable] = new Set();

    for (let reachable of unitSets[variable]) {
      for (let prod of grammar[reachable]) {
        if (!isUnitProduction(prod)) {
          newGrammar[variable].add(prod);
        }
      }
    }
  }

  return { unitSets, newGrammar };
}

const result = removeUnitProductions(grammar);

// Output
console.log("UNIT Sets:");
for (let key in result.unitSets) {
  console.log(`UNIT(${key}) = { ${[...result.unitSets[key]].join(", ")} }`);
}

console.log("\nFinal Grammar after Unit Production Removal:");
for (let key in result.newGrammar) {
  console.log(`${key} -> ${[...result.newGrammar[key]].join(" | ")}`);
}
